package com.kh.app.domain.product.svc;

import com.kh.app.domain.entity.Product;
import com.kh.app.domain.entity.UploadFile;
<<<<<<< HEAD
import com.kh.app.web.common.AttachFileType;
=======
>>>>>>> 1c5bdcb09bc7c5290d072754755577a26743badf

import java.util.List;
import java.util.Optional;

public interface ProductSVC {
  //등록
  Long save(Product product);
  Long save(Product product, List<UploadFile> uploadFiles);
  //조회;
  Optional<Product> findById(Long productId);
  //수정
  int update(Long productId,Product product);
  int update(Long productId,Product product,List<UploadFile> uploadFiles);
  //삭제
  int delete(Long productId);
<<<<<<< HEAD
  int delete(Long productId, AttachFileType attachFileType);
=======
  int delete(Long productId, String code);
>>>>>>> 1c5bdcb09bc7c5290d072754755577a26743badf
  /**
   * 부분삭제
   * @param productIds
   * @return
   */
  int deleteParts(List<Long> productIds);
  //목록
  List<Product> findAll();
  /**
   * 상품존재유무
   * @param productId 상품아이디
   * @return
   */
  boolean isExist(Long productId);
}
