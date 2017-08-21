package cn.ileng.modules.sys.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileUploadBase.FileSizeLimitExceededException;
import org.springframework.web.multipart.MultipartFile;

import cn.ileng.core.common.service.ICommonService;
import cn.ileng.core.utils.upload.exception.FileNameLengthLimitExceededException;
import cn.ileng.core.utils.upload.exception.InvalidExtensionException;
import cn.ileng.modules.sys.entity.Attachment;

public interface IAttachmentService extends ICommonService<Attachment> {
	/**
	 *
	 * @title: upload
	 * @description: 文件上传
	 * @param request
	 * @param file
	 * @return
	 * @return: Attachment
	 */
	public Attachment upload(HttpServletRequest request, MultipartFile file) throws FileSizeLimitExceededException,
			InvalidExtensionException, FileNameLengthLimitExceededException, IOException;
}
