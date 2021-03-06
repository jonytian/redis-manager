package com.newegg.ec.redis.plugin.rct.report.converseFactory;

import com.newegg.ec.redis.entity.AnalyzerConstant;
import com.newegg.ec.redis.plugin.rct.report.IAnalyzeDataConverse;
import com.newegg.ec.redis.plugin.rct.report.impl.DataTypeDataConverse;
import com.newegg.ec.redis.plugin.rct.report.impl.PrefixDataConverse;
import com.newegg.ec.redis.plugin.rct.report.impl.TTLDataConverse;
import com.newegg.ec.redis.plugin.rct.report.impl.TopKeyDataConverse;

import java.util.Objects;


/**
 * @author kz37
 * @date 2018/10/23
 */
public class ReportDataConverseFacotry {

	public static IAnalyzeDataConverse getReportDataConverse(String analyzerType) {

		int type = Integer.parseInt(analyzerType);

		if (AnalyzerConstant.DATA_TYPE_ANALYZER == type) {
			return new DataTypeDataConverse();
		} else if (AnalyzerConstant.PREFIX_ANALYZER == type) {
			return new PrefixDataConverse();
		} else if (AnalyzerConstant.TOP_KEY_ANALYZER == type) {
			return new TopKeyDataConverse();
		} else if (AnalyzerConstant.TTL_ANALYZER == type) {
			return new TTLDataConverse();
		} else {
			return null;
		}
	}

	public static IAnalyzeDataConverse getReportDataConverseByString(String analyzerType) {

		if (Objects.equals(IAnalyzeDataConverse.DATA_TYPE_ANALYZE,analyzerType)) {
			return new DataTypeDataConverse();
		} else if (Objects.equals(IAnalyzeDataConverse.PREFIX_KEY_BY_COUNT,analyzerType) || Objects.equals(IAnalyzeDataConverse.PREFIX_KEY_BY_MEMORY,analyzerType)) {
			return new PrefixDataConverse();
		} else if (Objects.equals(IAnalyzeDataConverse.TOP_KEY_ANALYZE,analyzerType)) {
			return new TopKeyDataConverse();
		} else if (Objects.equals(IAnalyzeDataConverse.TTL_ANALYZE,analyzerType)) {
			return new TTLDataConverse();
		} else {
			return null;
		}
	}

}
