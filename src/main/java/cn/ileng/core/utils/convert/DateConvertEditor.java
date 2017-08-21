package cn.ileng.core.utils.convert;

import java.beans.PropertyEditorSupport;
import org.springframework.util.StringUtils;
import cn.ileng.core.utils.DateUtils;

/**
 * 时间处理类
 *
 * @author ileng
 * @date 2016-12-21
 * @version V 1.0
 */
public class DateConvertEditor extends PropertyEditorSupport {

	public void setAsText(String text) throws IllegalArgumentException {
		if (StringUtils.hasText(text)) {
			try {
				setValue(DateUtils.parseDate(text));
			} catch (Exception ex) {
				IllegalArgumentException iae = new IllegalArgumentException("Could not parse date: " + ex.getMessage());
				iae.initCause(ex);
				throw iae;
			}
		} else {
			setValue(null);
		}
	}
}
