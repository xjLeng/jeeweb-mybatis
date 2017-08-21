package cn.ileng.core.utils;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * All rights Reserved, Designed By www.ileng.cn
 *
 * @title: ImagesUtils.java
 * @package cn.ileng.core.utils
 * @description: 判断判断文件
 * @author: ileng
 * @date: 2017年5月22日 下午9:25:14
 * @version V1.0
 * @copyright: 2017 www.ileng.cn Inc. All rights reserved.
 *
 */
public class ImagesUtils {

	private static final String[] IMAGES_SUFFIXES = { "bmp", "jpg", "jpeg", "gif", "png", "tiff" };

	/**
	 * 是否是图片附件
	 *
	 * @param filename
	 * @return
	 */
	public static boolean isImage(String filename) {
		if (filename == null || filename.trim().length() == 0)
			return false;
		return ArrayUtils.contains(IMAGES_SUFFIXES, FilenameUtils.getExtension(filename).toLowerCase());
	}

}
