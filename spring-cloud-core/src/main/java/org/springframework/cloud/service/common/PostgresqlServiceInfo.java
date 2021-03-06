package org.springframework.cloud.service.common;

import org.springframework.cloud.service.ServiceInfo.ServiceLabel;


/**
 *
 * @author Ramnivas Laddad
 *
 */
@ServiceLabel("postgresql")
public class PostgresqlServiceInfo extends RelationalServiceInfo {

    private static final String JDBC_URL_TYPE = "postgresql";

    public static final String POSTGRES_SCHEME = "postgres";

	public PostgresqlServiceInfo(String id, String url) {
		super(id, url, JDBC_URL_TYPE);
	}
}
