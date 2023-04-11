package com.kh.app.web.form.product;

import com.kh.app.domain.entity.UploadFile;
import lombok.Data;

import java.util.List;

@Data
public class DetailForm {
  private Long productId;
  private String pname;
  private Long quantity;
  private Long price;

  private UploadFile attachedFile;        // 일반 파일
  private List<UploadFile> imagedFiles;  // 이미지파일
<<<<<<< HEAD
}
=======
}
>>>>>>> 1c5bdcb09bc7c5290d072754755577a26743badf
