package com.zx.sms.connect.manager.cmpp;

import com.zx.sms.connect.manager.ClientEndpoint;
import com.zx.sms.connect.manager.EndpointConnector;
import com.zx.sms.connect.manager.EndpointEntity;

/**
 *@author Lihuanghe(18852780@qq.com)
 */
public class CMPPClientEndpointEntity extends CMPPEndpointEntity implements ClientEndpoint {

	@Override
	public CMPPClientEndpointConnector buildConnector() {
		return new CMPPClientEndpointConnector(this);
	}

}
