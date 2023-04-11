package com.kh.app.domain.product.svc;

<<<<<<< HEAD
import com.kh.app.domain.common.file.svc.UploadFileSVC;
=======
import com.kh.app.domain.common.dao.UploadFileDAO;
>>>>>>> 1c5bdcb09bc7c5290d072754755577a26743badf
import com.kh.app.domain.entity.Product;
import com.kh.app.domain.entity.UploadFile;
import com.kh.app.domain.product.dao.ProductDAO;
import com.kh.app.web.common.AttachFileType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class ProductSVCImpl implements ProductSVC{

  private final ProductDAO productDAO;
<<<<<<< HEAD
  private final UploadFileSVC uploadFileSVC;
=======
  private final UploadFileDAO uploadFileDAO;
>>>>>>> 1c5bdcb09bc7c5290d072754755577a26743badf

  @Override
  public Long save(Product product) {
    return productDAO.save(product);
  }

  @Override
  public Long save(Product product, List<UploadFile> uploadFiles) {
    Long productId = save(product);
    if (uploadFiles.size() > 0) {
      uploadFiles.stream().forEach(file->file.setRid(productId));
<<<<<<< HEAD
      uploadFileSVC.addFiles(uploadFiles);
=======
      uploadFileDAO.addFiles(uploadFiles);
>>>>>>> 1c5bdcb09bc7c5290d072754755577a26743badf
    }

    return productId;
  }

  @Override
  public Optional<Product> findById(Long productId) {
    return productDAO.findById(productId);
  }

  @Override
  public int update(Long productId, Product product) {
    return productDAO.update(productId, product);
  }

  @Override
  public int update(Long productId, Product product, List<UploadFile> uploadFiles) {
    productDAO.update(productId, product);
    if (uploadFiles.size() > 0) {
      uploadFiles.stream().forEach(file->file.setRid(productId));
<<<<<<< HEAD
      uploadFileSVC.addFiles(uploadFiles);
=======
      uploadFileDAO.addFiles(uploadFiles);
>>>>>>> 1c5bdcb09bc7c5290d072754755577a26743badf
    }
    return 0;
  }

  @Override
  public int delete(Long productId) {
    return productDAO.delete(productId);
  }

  @Override
<<<<<<< HEAD
  public int delete(Long productId, AttachFileType attachFileType) {
    //1) 상품정보 삭제
    int cnt = productDAO.delete(productId);

    //2) 물리파일 삭제
    List<UploadFile> uploadFiles = uploadFileSVC.findFilesByCodeWithRid(attachFileType, productId);
    List<String> files = uploadFiles.stream().map(file -> file.getStore_filename()).collect(Collectors.toList());
    uploadFileSVC.deleteFiles(attachFileType, files);

//    for (UploadFile uploadFile : uploadFiles) {
//      multipartFileToUploadFile.deleteFile(attachFileType, uploadFile.getStore_filename());
//    }
    
    //3) 메타정보삭제
    uploadFileSVC.deleteFileByCodeWithRid(attachFileType,productId);
=======
  public int delete(Long productId, String code) {
    int cnt = productDAO.delete(productId);
    uploadFileDAO.deleteFileByCodeWithRid(code,productId);
>>>>>>> 1c5bdcb09bc7c5290d072754755577a26743badf
    return cnt;
  }

  @Override
  public int deleteParts(List<Long> productIds) {
    return productDAO.deleteParts(productIds);
  }

  @Override
  public List<Product> findAll() {
    return productDAO.findAll();
  }

  @Override
  public boolean isExist(Long productId) {
    return productDAO.isExist(productId);
  }
<<<<<<< HEAD

}
=======
}
>>>>>>> 1c5bdcb09bc7c5290d072754755577a26743badf
