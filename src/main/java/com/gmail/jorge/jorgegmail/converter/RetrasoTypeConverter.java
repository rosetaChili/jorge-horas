package com.gmail.jorge.jorgegmail.converter;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

import com.gmail.jorge.jorgegmail.enums.RetrasoType;

@Configuration
public class RetrasoTypeConverter implements Converter<String, RetrasoType>{

	@Override
	public RetrasoType convert(String source) {
		try {
	          return RetrasoType.valueOf(source);
	       } catch(Exception e) {
	          return null; // or SortEnum.asc
	       }
	}

}
