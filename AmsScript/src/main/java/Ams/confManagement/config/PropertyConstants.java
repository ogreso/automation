package Ams.confManagement.config;

import com.ziroom.utils.PropertiesUtil;

public class PropertyConstants {

    public static final String inputOutValueSqlPath = "/InputOutValueSql.properties";

    private static String dnFile = "/DomainName.properties";
    private static String dbFile = "/DataBase.properties";
    /**
     * 各个系统域名
     */
    public static String INTERFACES_DOMIN = PropertiesUtil.getPropValAsString(dnFile, "INTERFACES_DOMIN");
    public static String CRM_DOMIN = PropertiesUtil.getPropValAsString(dnFile, "CRM_DOMIN");
    public static String ASSET_DOMAIN = PropertiesUtil.getPropValAsString(dnFile, "AMS_DOMAIN");

    // mysql 数据库
    public static String MYSQL_ADDRESS = PropertiesUtil.getPropValAsString(dbFile, "MYSQL_ADDRESS");
    public static String MYSQL_USERNAME = PropertiesUtil.getPropValAsString(dbFile, "MYSQL_USERNAME");
    public static String MYSQL_PASSWORD = PropertiesUtil.getPropValAsString(dbFile, "MYSQL_PASSWORD");
    public static String MYSQL_PORT = PropertiesUtil.getPropValAsString(dbFile, "MYSQL_PORT");
    public static String ZHUN_MYSQL_ADDRESS = PropertiesUtil.getPropValAsString(dbFile, "ZHUN_MYSQL_ADDRESS");

    // oracle 数据库
    public static String ORACLE_ADDRESS = PropertiesUtil.getPropValAsString(dbFile, "ORACLE_ADDRESS");
    public static String ORACLE_SID = PropertiesUtil.getPropValAsString(dbFile, "ORACLE_SID");
    public static String ORACLE_USERNAME = PropertiesUtil.getPropValAsString(dbFile, "ORACLE_USERNAME");
    public static String ORACLE_PASSWORD = PropertiesUtil.getPropValAsString(dbFile, "ORACLE_PASSWORD");
    public static String ORACLE_PORT = PropertiesUtil.getPropValAsString(dbFile, "ORACLE_PORT");

    // 登陆接口地址
    public static final String login = "/index.php?_p=api_mobile&_a=login_normal";

    // 付款
    public static final String getContractInfo = "/crm-reserve/contractInfo/getContractInfo";
}