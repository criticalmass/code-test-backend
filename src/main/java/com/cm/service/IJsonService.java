package com.cm.service;

import com.cm.pojo.CMResponse;

public interface IJsonService {

	public CMResponse parseJson(String url) throws Exception;

}
