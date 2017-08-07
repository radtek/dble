package io.mycat.config.loader.zkprocess.entity.server.firewall.whitehost;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by huqing.yan on 2017/6/16.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "host")
public class Host {
	@XmlAttribute(required = true)
	protected String host;
	@XmlAttribute(required = true)
	protected String user;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "table{" + "host='" + host + '\'' + ", user='" + user + '}';
	}
}