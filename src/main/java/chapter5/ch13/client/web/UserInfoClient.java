package chapter5.ch13.client.web;

import chapter5.ch13.domain.userInfo.UserInfo;
import chapter5.ch13.domain.userInfo.dao.UserInfoDao;
import chapter5.ch13.domain.userInfo.dao.mysql.UserInfoMysqlDao;
import chapter5.ch13.domain.userInfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
  public static void main(String[] args) throws IOException {

    FileInputStream fis = new FileInputStream("/Users/jinsunghwang/Project/PracticeJava/do-it-java-programing/src/main/java/chapter5/ch13/db.properties");
    Properties prop = new Properties();
    prop.load(fis);

    String dbType = prop.getProperty("DBTYPE");
    System.out.println(dbType);

    UserInfo userInfo = new UserInfo();
    userInfo.setUserId("11");
    userInfo.setPasswd("!@#$%^");
    userInfo.setUserName("james");

    UserInfoDao userInfoDao = null;

    if (dbType.equals("ORACLE")) {
      userInfoDao = new UserInfoOracleDao();
    } else if (dbType.equals("MYSQL")) {
      userInfoDao = new UserInfoMysqlDao();
    } else {
      System.out.println("not support");
    }

    if (userInfoDao != null) {
      userInfoDao.insertUserInfo(userInfo);
      userInfoDao.updateUserInfo(userInfo);
      userInfoDao.deleteUserInfo(userInfo);
    }

  }
}
