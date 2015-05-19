「はじめてのSpring Boot」サポートページ
********************************************************************************

「\ `はじめてのSpring Boot <http://www.kohgakusha.co.jp/books/detail/978-4-7775-1865-4>`_\ 」のサポートページです。

このページでサンプルコードと正誤表を管理します。書籍の内容に関する間違いの指摘等はIssuesかPull Requestでお願いします。

また、疑問やコメントはTwitterでハッシュタグ「#hajiboot」をつけてツイートしていただければ極力お答えします。気軽にツイートしてください。

正誤表 (第2刷)
================================================================================

.. list-table::
   :header-rows: 1

   * - 場所
     - 誤
     - 正
     - 訂正日
   * - P.45 ページ先頭
     - 「pom.xml」に、以下のように依存関係を追加します。
     - 「pom.xml」に、以下のように依存関係を追加します。\ **なお、今後pom.xmlを全て記載する際には、これまでのようにmvn archetype:generateでプロジェクトを作り直してください。-DartifactIdにはpom.xmlの<artifactId>タグの値を指定してください。**\ 
     - 2015-02-21
   * - P.65 ページ末
     - 実行できます。
     - 実行できます。2.2で作成した\ ``App``\ 、\ ``AppConfig``\ および、\ ``logback.xml``\ を今回のプロジェクトにコピーしてください。
     - 2015-02-21
   * - P.68 中央のAppクラスの説明の後
     - データの出力順が、以下のように変わりました。
     - ここで、2.2.3で作成したdata.sqlをsrc/main/resourcesにコピーしてください。その後、「Appクラス」を実行しましょう。データの出力順が、以下のように変わりました。
     - 2015-02-21
   * - P.128 SecurityConfigクラス
     - | \ ``.usernameParameter("username").passwordParameter("password")``\ 
       | \ ``.and();``\ 
     - \ ``.usernameParameter("username").passwordParameter("password");``\ 
     - 2015-05-20
   * - P.133 ファイルパス(2箇所)
     - ssrc/main/resources/db/migration/V3_add_user.sql
     - src/main/resources/db/migration/V3__add_user.sql
     - 2015-02-21
   * - P.150 AppConfig クラス
     - url = "jdbc:postgresql://" + dbUri.getHost() + dbUri.getPath() + ":" + dbUri.getPort() + dbUri.getPath();
     - url = "jdbc:postgresql://" + dbUri.getHost() + ":" + dbUri.getPort() + dbUri.getPath();
     - 2015-03-13

正誤表 (第1刷)
================================================================================

.. list-table::
   :header-rows: 1

   * - 場所
     - 誤
     - 正
     - 訂正日
   * - P.19 コマンドプロンプト内 (2箇所)
     - \ ``$ java -jar target\\hajiboot-1.0.0-SNAPSHOT.jar``\ 
     - \ ``$ java -jar target\hajiboot-1.0.0-SNAPSHOT.jar``\ 
     - 2014-11-20
   * - P.25 中央よりやや下
     - \ ``<version>1.2.0.RELEASE</version>``\ 
     - \ ``<version>1.2.1.RELEASE</version>``\ 
     - 2014-11-18
   * - P.30 プログラム解説 (2)
     - 「DI コンテナ」に管理させたい「Bean」を生成するメソッドに、「@Configuration」
     - 「DI コンテナ」に管理させたい「Bean」を生成するメソッドに、「@Bean」
     - 2014-11-26
   * - P.45 ページ先頭
     - 「pom.xml」に、以下のように依存関係を追加します。
     - 「pom.xml」に、以下のように依存関係を追加します。\ **なお、今後pom.xmlを全て記載する際には、これまでのようにmvn archetype:generateでプロジェクトを作り直してください。-DartifactIdにはpom.xmlの<artifactId>タグの値を指定してください。**\ 
     - 2015-02-21
   * - P.47 米印のコメント
     - 「autoFigure」の仕組みについては
     - 「autoconfigure」の仕組みについては
     - 2014-11-18
   * - P.54 「Log4JDBC」用の「DataSource」の定義
     - これまでは「Spring Boot」の「@EnableAutoConfiguration」の効果で、「DateSource」が
     - これまでは「Spring Boot」の「@EnableAutoConfiguration」の効果で、「Dat\ **a**\ Source」が
     - 2014-11-25
   * - P.54 \ ``realDataSource``\ を定義する箇所
     - \ ``@Bean``\ 
     - \ ``@Bean(destroyMethod = "close")``\ 
     - 2014-11-18
   * - P.58 項番(1)
     - (b) 「エラーが発生した場合」は 
     - (b) 「\ **実行時例外が**\ 発生した場合」は (*1)
     - 2014-11-18
   * - P.65 ページ末
     - 実行できます。
     - 実行できます。2.2で作成した\ ``App``\ 、\ ``AppConfig``\ および、\ ``logback.xml``\ を今回のプロジェクトにコピーしてください。
     - 2015-02-21
   * - P.68 中央のAppクラスの説明
     - \ ``customerRepository.findAllOrderById()``\ 
     - \ ``customerRepository.findAllOrderByName()``\ 
     - 2014-11-18
   * - P.68 中央のAppクラスの説明の後
     - データの出力順が、以下のように変わりました。
     - ここで、2.2.3で作成したdata.sqlをsrc/main/resourcesにコピーしてください。その後、「Appクラス」を実行しましょう。データの出力順が、以下のように変わりました。
     - 2015-02-21
   * - P.69 ノート
     - \ ``List<Customer> findAllOrderById()``\ 
     - \ ``List<Customer> findAllOrderByName()``\ 
     - 2014-11-18
   * - P.77 表の1行1列目
     - PI名 
     - API名 
     - 2014-11-26
   * - P.89 前半
     - しかし、本節では
     - 本節では
     - 2014-11-26
   * - P.89 三分どころ
     - 「プログラマ」と「デザイナ」間での「HTML」ややり取りにおける変換コスト
     - 「プログラマ」と「デザイナ」間での「HTML」のやり取りにおける変換コスト 
     - 2014-11-26
   * - P.89 表のタイトル
     - 【コマンド・プロンプト】追加されたライブラリの確認
     - 【コマンド・プロンプト】簡易顧客管理システムの処理一覧
     - 2014-11-26
   * - P.94,95 ファイルパス(3箇所)
     - src/main/resources/customers/list.html
     - src/main/resources/templates/customers/list.html
     - 2014-12-01
   * - P.94,95 ファイルパス(3箇所)
     - src/main/resources/customers/list.html
     - src/main/resources/templates/customers/list.html
     - 2014-12-10
   * - P.99 サンプルコードの上から5行目
     - name="firstName"
     - name="lastName"
     - 2014-11-26
   * - P.117 「このように～」の文章 
     - 「このように～」の文章がノートの外側
     - 「このように～」の文章がノートの内側
     - 2014-11-18
   * - P.118 中央
     - アプリケーション起動時に「Java API」を自動で行う
     - アプリケーション起動時に「Flyway」の「Java API」を自動で実行する
     - 2014-11-18
   * - P.121 下
     - 「3.5.1」 「application.yml」の変更
     - 「3.5.1」 「User」の「エンティティ」と「リポジトリ」作成
     - 2014-11-24
   * - P.128 SecurityConfigクラス
     - | \ ``.usernameParameter("username").passwordParameter("password")``\ 
       | \ ``.and();``\ 
     - \ ``.usernameParameter("username").passwordParameter("password");``\ 
     - 2015-05-20
   * - P.131 loginForm.html (1)付近
     - Invalid username and password.
     - ユーザー名またはパスワードが正しくありません。
     - 2014-11-18
   * - P.133 ファイルパス(2箇所)
     - src/main/resources/V3_add_user.sql
     - src/main/resources/db/migration/V3__add_user.sql
     - 2014-12-01
   * - P.150 AppConfig クラス
     - url = "jdbc:postgresql://" + dbUri.getHost() + dbUri.getPath() + ":" + dbUri.getPort() + dbUri.getPath();
     - url = "jdbc:postgresql://" + dbUri.getHost() + ":" + dbUri.getPort() + dbUri.getPath();
     - 2015-03-13
   * - P.155 
     - 「Unitコード」
     - 「JUnitコード」
     - 2014-11-18
   * - P.163 附録Aの下の文章
     - 「Java SE 8u5」
     - 「Java SE 8u25」
     - 2014-11-18

\*1 ... チェック例外の場合はロールバックされません(\ **重要**\ )

Spring Boot 1.2へのアップデート
================================================================================
「はじめてのSpring Boot」出版後、Spring Boot 1.2がリリースされました。リリースノートは\ `こちら <https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-1.2-Release-Notes>`_\ を参照してください。
代表的な変更点は筆者の\ `発表資料 <http://www.slideshare.net/makingx/spring-boot12>`_\ にもまとまっています。

また、Spring Boot 1.2ではSpring Frameworkのバージョンが4.1になりました。Spring Framework 4.1の新機能は\ `こちらの発表資料 <http://www.slideshare.net/makingx/springone-2gx-2014-spring-41-jsug/19>`_\ を参照してください。

Spring Boot 1.2を使う場合は以下のように、\ ``spring-boot-starter-parent``\ のバージョンを変更するだけで良いです。

.. code-block:: xml
   
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>1.2.1.RELEASE</version>
    </parent>


ここではSpring Boot 1.2の変更で本書に影響する箇所について紹介します。


\ ``@SpringBootApplication``\ の使用
--------------------------------------------------------------------------------
新たに\ ``@SpringBootApplication``\ が導入されました。これは\ ``@EnableAutoConfiguration``\ + \ ``@ComponentScan``\ + \ ``@Configuration``\ を1つにまとめたものです。

本書では\ ``App``\ クラスに\ ``@EnableAutoConfiguration``\ と \ ``@ComponentScan``\ をつけていましたので、この2つの代わりに\ ``@SpringBootApplication``\ をつけるだけで良くなります。

\ ``CharacterEncodingFilter``\ のデフォルト化
--------------------------------------------------------------------------------
\ ``CharacterEncodingFilter``\ によるUTF-8の設定が自動で行われるようになりました。3.3以降で\ ``AppConfig``\ クラスに設定していた以下の内容は省略可能になります。

.. code-block:: java

    @Order(Ordered.HIGHEST_PRECEDENCE)
    @Bean
    CharacterEncodingFilter characterEncodingFilter() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
        return filter;
    }

FAQ
================================================================================

ThymeleafはXHTMLじゃないと使えないのか？
--------------------------------------------------------------------------------

NekoHTMLを使うことで、XHTMLではないHTML5(Legacy HTML5と呼ばれています)を扱えます。

pom.xmlに以下の依存関係を追加して、

.. code-block:: xml

   <dependency>
       <groupId>net.sourceforge.nekohtml</groupId>
       <artifactId>nekohtml</artifactId>
       <version>1.9.21</version>
   </dependency>

application.ymlに以下の設定を行ってください。

.. code-block:: yaml

   spring.thymeleaf.mode: LEGACYHTML5

org.h2.jdbc.JdbcSQLException: 機能はサポートされていません: "isWrapperFor"が出力される
--------------------------------------------------------------------------------------------

Spring Boot1.1ではH2(1.3.176) + Spring Data JPA (Hibernate) + Log4JDBCの組み合わせで以下のようなエラーログが出力されます。

.. code-block:: bash

  2014-12-09 13:55:49.711 ERROR 6512 --- [o-auto-1-exec-5] jdbc.sqltiming                           : 15. PreparedStatement.isWrapperFor(java.sql.CallableStatement)

  org.h2.jdbc.JdbcSQLException: 機能はサポートされていません: "isWrapperFor"
  Feature not supported: "isWrapperFor" [50100-176]
          at org.h2.message.DbException.getJdbcSQLException(DbException.java:344)
          at org.h2.message.DbException.get(DbException.java:178)
          at org.h2.message.DbException.get(DbException.java:154)
          at org.h2.message.DbException.getUnsupportedException(DbException.java:215)
          at org.h2.message.TraceObject.unsupported(TraceObject.java:395)
          at org.h2.jdbc.JdbcStatement.isWrapperFor(JdbcStatement.java:1076)
          at net.sf.log4jdbc.PreparedStatementSpy.isWrapperFor(PreparedStatementSpy.java:1142)
          at org.hibernate.engine.jdbc.internal.ResultSetReturnImpl.isTypeOf(ResultSetReturnImpl.java:99)
          at org.hibernate.engine.jdbc.internal.ResultSetReturnImpl.extract(ResultSetReturnImpl.java:70)
          at org.hibernate.loader.Loader.getResultSet(Loader.java:2065)
          at org.hibernate.loader.Loader.executeQueryStatement(Loader.java:1862)
          at org.hibernate.loader.Loader.executeQueryStatement(Loader.java:1838)
          at org.hibernate.loader.Loader.doQuery(Loader.java:909)
          at org.hibernate.loader.Loader.doQueryAndInitializeNonLazyCollections(Loader.java:354)
          at org.hibernate.loader.Loader.doList(Loader.java:2553)
          at org.hibernate.loader.Loader.doList(Loader.java:2539)
          at org.hibernate.loader.Loader.listIgnoreQueryCache(Loader.java:2369)
          at org.hibernate.loader.Loader.list(Loader.java:2364)
          at org.hibernate.loader.hql.QueryLoader.list(QueryLoader.java:496)
          at org.hibernate.hql.internal.ast.QueryTranslatorImpl.list(QueryTranslatorImpl.java:387)
          at org.hibernate.engine.query.spi.HQLQueryPlan.performList(HQLQueryPlan.java:231)
          at org.hibernate.internal.SessionImpl.list(SessionImpl.java:1264)
          at org.hibernate.internal.QueryImpl.list(QueryImpl.java:103)
          at org.hibernate.jpa.internal.QueryImpl.list(QueryImpl.java:573)
          at org.hibernate.jpa.internal.QueryImpl.getResultList(QueryImpl.java:449)
          at org.springframework.data.jpa.repository.query.JpaQueryExecution$PagedExecution.doExecute(JpaQueryExecution.java:153)
          at org.springframework.data.jpa.repository.query.JpaQueryExecution.execute(JpaQueryExecution.java:59)
          at org.springframework.data.jpa.repository.query.AbstractJpaQuery.doExecute(AbstractJpaQuery.java:97)
          at org.springframework.data.jpa.repository.query.AbstractJpaQuery.execute(AbstractJpaQuery.java:88)
          at org.springframework.data.repository.core.support.RepositoryFactorySupport$QueryExecutorMethodInterceptor.doInvoke(RepositoryFactorySupport.java:384)
          at org.springframework.data.repository.core.support.RepositoryFactorySupport$QueryExecutorMethodInterceptor.invoke(RepositoryFactorySupport.java:344)
          at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:179)
          at org.springframework.transaction.interceptor.TransactionInterceptor$1.proceedWithInvocation(TransactionInterceptor.java:98)
          (以下略)

以下のためです。

* HibernateがJDBC 4.0で追加された\ ``isWrapperFor``\ を呼んでいる
* H2(1.3.176)が\ ``isWrapperFor``\ を実装していない
* Log4JBDCがJDBCのエラーをログ出力する
* (Hibernateが\ ``isWrapperFor``\ がサポートされていないという例外を握りつぶす)

普段から起こっている事象ですが、Log4JBDCによって顕在化してしまっています。

無視しても問題ないのですが、精神衛生上よろしくないので修正したいという場合は、H2のバージョンをあげて\ ``isWrapperFor``\ がサポートされているものを使えばよいです。

H2のバージョンはspring-boot-starter-parentで管理されており、上書きするにはプロジェクトのpom.xmlにバージョンプロパティを指定すればよいです。

pom.xmlを以下のように修正してください。


.. code-block:: xml

    <properties>
        <java.version>1.8</java.version>
        <h2.version>1.4.182</h2.version><!-- ここ追加 -->
    </properties>

ちなみにSpring Boot 1.2では始めからH2 1.4.182が使われるようになっています。

なお、このバージョンのH2を使用すると、Windows上で\ ``jdbc:h2:file:/tmp/testdb``\ というURLの指定が出来ず、\ ``jdbc:h2:file:c:/tmp/testdb``\ というようにドライブレターを付ける必要があります。

この挙動が嫌な場合(\ ``jdbc:h2:file:/tmp/testdb``\ のまま使いたい場合)、実行時に\ ``-Dh2.implicitRelativePath=true``\ を付けてください。毎回このプロパティを指定するのが面倒な場合は、\ ``main``\ メソッドで以下のように実装してください

.. code-block:: java

  public static void main(String[] args) {
      if (System.getProperty("h2.implicitRelativePath") == null) {
          // keep compatibility with H2 1.3
          // prevent http://www.h2database.com/javadoc/org/h2/api/ErrorCode.html#c90011
          System.setProperty("h2.implicitRelativePath", "true");
      }
      SpringApplication.run(App.class, args);
  }


org.postgresql.util.PSQLException: 方法 org.postgresql.jdbc4.Jdbc4Connection.createClob() はまだ装備されていません。が出力される
-----------------------------------------------------------------------------------------------------------------------------------

H2同様にPostgreSQL + Hibernateでも同様のエラーログが出力されます。

.. code-block:: bash

    2014-12-09 20:41:13.753  INFO 5484 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.PostgreSQLDialect
    2014-12-09 20:41:13.783 ERROR 5484 --- [           main] jdbc.sqltiming                           : 1. Connection.createClob()

    org.postgresql.util.PSQLException: 方法 org.postgresql.jdbc4.Jdbc4Connection.createClob() はまだ装備されていません。
            at org.postgresql.Driver.notImplemented(Driver.java:753)
            at org.postgresql.jdbc4.AbstractJdbc4Connection.createClob(AbstractJdbc4Connection.java:41)
            at org.postgresql.jdbc4.Jdbc4Connection.createClob(Jdbc4Connection.java:21)
            at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
            at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
            at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
            at java.lang.reflect.Method.invoke(Method.java:483)
            at org.springsource.loaded.ri.ReflectiveInterceptor.jlrMethodInvoke(ReflectiveInterceptor.java:1270)
            at org.apache.tomcat.jdbc.pool.ProxyConnection.invoke(ProxyConnection.java:126)
            at org.apache.tomcat.jdbc.pool.JdbcInterceptor.invoke(JdbcInterceptor.java:109)
            at org.apache.tomcat.jdbc.pool.DisposableConnectionFacade.invoke(DisposableConnectionFacade.java:80)
            at com.sun.proxy.$Proxy52.createClob(Unknown Source)
            at net.sf.log4jdbc.ConnectionSpy.createClob(ConnectionSpy.java:496)
            at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
            at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
            at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
            at java.lang.reflect.Method.invoke(Method.java:483)
            at org.springsource.loaded.ri.ReflectiveInterceptor.jlrMethodInvoke(ReflectiveInterceptor.java:1270)
            at org.hibernate.engine.jdbc.internal.LobCreatorBuilder.useContextualLobCreation(LobCreatorBuilder.java:112)
            at org.hibernate.engine.jdbc.internal.LobCreatorBuilder.<init>(LobCreatorBuilder.java:63)
            at org.hibernate.engine.jdbc.internal.JdbcServicesImpl.configure(JdbcServicesImpl.java:192)
            (略)
            
    2014-12-09 20:41:13.791  INFO 5484 --- [           main] o.h.e.jdbc.internal.LobCreatorBuilder    : HHH000424: Disabling contextual LOB creation as createClob() method threw error : java.lang.reflect.InvocationTargetException

これも実際は問題ないのですが、Log4JDBCによってエラーが見えてしまっています。

最新の9.3-1102-jdbc41で試してもまだ実装されていませんでした。

.. code-block:: xml

    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <version>9.3-1102-jdbc41</version>
    </dependency>

.. code-block:: bash

    2014-12-09 20:48:53.675 ERROR 7484 --- [           main] jdbc.sqltiming                           : 1. Connection.createClob()

    java.sql.SQLFeatureNotSupportedException: org.postgresql.jdbc4.Jdbc4Connection.createClob() メソッドはまだ実装されていません。
            at org.postgresql.Driver.notImplemented(Driver.java:729)
            at org.postgresql.jdbc4.AbstractJdbc4Connection.createClob(AbstractJdbc4Connection.java:51)
            at org.postgresql.jdbc4.Jdbc4Connection.createClob(Jdbc4Connection.java:21)
            at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)


ただ、書籍で扱っているPostgreSQL JDBCドライバのバージョンは9.0-801.jdbc4と古く、
https://devcenter.heroku.com/articles/heroku-postgresql#version-support-and-legacy-infrastructure\ の通り、今はHeroku側もデフォルトでPostgreSQLのバージョンが9.3なので、上げた方が良いですね。

Lombok 1.16にするとRESTのレスポンスからフィールドが消える
--------------------------------------------------------------------------------------------
\ `こちら <https://twitter.com/kis/status/569250617882861568>`_\ 参照。

Lombokのバージョン1.16(書籍では1.14を使用)にすると3章以降の\ ``CustomerRestController``\ のレスポンスJSONからフィールドが消えてしまうようです。

1.16を使う場合は、以下のように\ ``Customer``\ クラスに\ ``Serializable``\ をつけてください。

.. code-block:: java

   public class Customer implements Serializable {
      // ...
   }
   
なお、本書では省略しましたが、一般的には永続化や複製する場合などを考え、Entityには\ ``Serializable``\ をつけます。
1.16に限らず、\ ``Serializable``\ をつけたほうが良いです。


JDK 1.8.0_40以上で\ ``mvn spring-boot:run``\ に失敗する
--------------------------------------------------------------------------------------------
JDK 1.8.0_40以上では本書で指定したSpring Loadedが動きません。 https://github.com/spring-projects/spring-loaded/issues/108

1.2.2以上にバージョンアップするか、\ ``springloaded``\ の定義を削除してください。

* バージョンアップ

   .. code-block:: xml
   
      <plugin>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-maven-plugin</artifactId>
          <dependencies>
              <dependency>
                  <groupId>org.springframework</groupId>
                  <artifactId>springloaded</artifactId>
                  <version>1.2.3.RELEASE</version>
              </dependency>
          </dependencies>
       </plugin>

* 削除

   .. code-block:: xml
   
      <plugin>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-maven-plugin</artifactId>
          <!-- ここから削除
          <dependencies>
              <dependency>
                  <groupId>org.springframework</groupId>
                  <artifactId>springloaded</artifactId>
                  <version>1.2.1.RELEASE</version>
              </dependency>
          </dependencies>
          ここまで削除 -->
       </plugin>

Spring Boot 1.2.3に上げると\ ``DataSource``\ の作成に失敗する
--------------------------------------------------------------------------------------------

Spring Boot 1.2.3にすると、\ ``AppConfig``\ に二つ定義した\ ``DataSource``\ が原因で

\ ``No qualifying bean of type [javax.sql.DataSource] is defined: expected single matching bean but found 2: realDataSource,dataSource``\ 

というエラーメッセージが出力され、アプリケーションの起動に失敗します (1.2.2では問題ない)。

.. code-block:: console

     .   ____          _            __ _ _
    /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
   ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
    \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
     '  |____| .__|_| |_|_| |_\__, | / / / /
    =========|_|==============|___/=/_/_/_/
    :: Spring Boot ::        (v1.2.3.RELEASE)
   
   (略)
   2015-05-20 02:56:33.804  WARN 4027 --- [           main] ationConfigEmbeddedWebApplicationContext : Exception encountered during context initialization - cancelling refresh attempt
   
   org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private javax.sql.DataSource org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration.dataSource; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'realDataSource' defined in class path resource [com/example/AppConfig.class]: Initialization of bean failed; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSourceInitializer': Invocation of init method failed; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type [javax.sql.DataSource] is defined: expected single matching bean but found 2: realDataSource,dataSource
   	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:334)
   	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1210)
   	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
   	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:476)
   	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:303)
   	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230)
   	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:299)
   	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:194)
   	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:368)
   	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1119)
   	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1014)
   	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:504)
   	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:476)
   	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:303)
   	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230)
   	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:299)
   	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:194)
   	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:956)
   	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:747)
   	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:480)
   	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:118)
   	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:686)
   	at org.springframework.boot.SpringApplication.run(SpringApplication.java:320)
   	at org.springframework.boot.SpringApplication.run(SpringApplication.java:957)
   	at org.springframework.boot.SpringApplication.run(SpringApplication.java:946)
   	at com.example.App.main(App.java:12)
   Caused by: org.springframework.beans.factory.BeanCreationException: Could not autowire field: private javax.sql.DataSource org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration.dataSource; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'realDataSource' defined in class path resource [com/example/AppConfig.class]: Initialization of bean failed; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSourceInitializer': Invocation of init method failed; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type [javax.sql.DataSource] is defined: expected single matching bean but found 2: realDataSource,dataSource
   	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:561)
   	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88)
   	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:331)
   	... 25 common frames omitted
   Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'realDataSource' defined in class path resource [com/example/AppConfig.class]: Initialization of bean failed; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSourceInitializer': Invocation of init method failed; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type [javax.sql.DataSource] is defined: expected single matching bean but found 2: realDataSource,dataSource
   	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:547)
   	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:476)
   	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:303)
   	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230)
   	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:299)
   	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:194)
   	at org.springframework.beans.factory.support.DefaultListableBeanFactory.findAutowireCandidates(DefaultListableBeanFactory.java:1120)
   	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1044)
   	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:942)
   	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:533)
   	... 27 common frames omitted
   Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSourceInitializer': Invocation of init method failed; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type [javax.sql.DataSource] is defined: expected single matching bean but found 2: realDataSource,dataSource
   	at org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor.postProcessBeforeInitialization(InitDestroyAnnotationBeanPostProcessor.java:136)
   	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyBeanPostProcessorsBeforeInitialization(AbstractAutowireCapableBeanFactory.java:408)
   	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1566)
   	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:539)
   	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:476)
   	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:303)
   	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230)
   	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:299)
   	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:217)
   	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:350)
   	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:331)
   	at org.springframework.boot.autoconfigure.jdbc.DataSourceInitializerPostProcessor.postProcessAfterInitialization(DataSourceInitializerPostProcessor.java:62)
   	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyBeanPostProcessorsAfterInitialization(AbstractAutowireCapableBeanFactory.java:422)
   	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1579)
   	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:539)
   	... 36 common frames omitted
   Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type [javax.sql.DataSource] is defined: expected single matching bean but found 2: realDataSource,dataSource
   	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:365)
   	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:331)
   	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:968)
   	at org.springframework.boot.autoconfigure.jdbc.DataSourceInitializer.init(DataSourceInitializer.java:67)
   	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
   	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
   	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
   	at java.lang.reflect.Method.invoke(Method.java:497)
   	at org.springsource.loaded.ri.ReflectiveInterceptor.jlrMethodInvoke(ReflectiveInterceptor.java:1270)
   	at org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor$LifecycleElement.invoke(InitDestroyAnnotationBeanPostProcessor.java:349)
   	at org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor$LifecycleMetadata.invokeInitMethods(InitDestroyAnnotationBeanPostProcessor.java:300)
   	at org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor.postProcessBeforeInitialization(InitDestroyAnnotationBeanPostProcessor.java:133)
   	... 50 common frames omitted
   
   2015-05-20 02:56:33.814  INFO 4027 --- [           main] o.apache.catalina.core.StandardService   : Stopping service Tomcat
   2015-05-20 02:56:33.837  INFO 4027 --- [           main] .b.l.ClasspathLoggingApplicationListener : Application failed to start with classpath: [file:/Users/maki/git/hajiboot-samples/chapter03/3.2.1_hajiboot-rest/src/main/resources/, file:/Users/maki/git/hajiboot-samples/chapter03/3.2.1_hajiboot-rest/src/main/resources/, file:/Users/maki/git/hajiboot-samples/chapter03/3.2.1_hajiboot-rest/target/classes/, file:/Users/maki/.m2/repository/org/aspectj/aspectjweaver/1.8.5/aspectjweaver-1.8.5.jar, file:/Users/maki/.m2/repository/org/springframework/boot/spring-boot-starter/1.2.3.RELEASE/spring-boot-starter-1.2.3.RELEASE.jar, file:/Users/maki/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.4.5/jackson-core-2.4.5.jar, file:/Users/maki/.m2/repository/org/springframework/spring-core/4.1.6.RELEASE/spring-core-4.1.6.RELEASE.jar, file:/Users/maki/.m2/repository/org/springframework/spring-context/4.1.6.RELEASE/spring-context-4.1.6.RELEASE.jar, file:/Users/maki/.m2/repository/org/springframework/boot/spring-boot-starter-data-jpa/1.2.3.RELEASE/spring-boot-starter-data-jpa-1.2.3.RELEASE.jar, file:/Users/maki/.m2/repository/org/yaml/snakeyaml/1.14/snakeyaml-1.14.jar, file:/Users/maki/.m2/repository/aopalliance/aopalliance/1.0/aopalliance-1.0.jar, file:/Users/maki/.m2/repository/org/springframework/spring-webmvc/4.1.6.RELEASE/spring-webmvc-4.1.6.RELEASE.jar, file:/Users/maki/.m2/repository/org/springframework/spring-orm/4.1.6.RELEASE/spring-orm-4.1.6.RELEASE.jar, file:/Users/maki/.m2/repository/com/h2database/h2/1.4.185/h2-1.4.185.jar, file:/Users/maki/.m2/repository/org/slf4j/jul-to-slf4j/1.7.11/jul-to-slf4j-1.7.11.jar, file:/Users/maki/.m2/repository/org/springframework/boot/spring-boot-starter-aop/1.2.3.RELEASE/spring-boot-starter-aop-1.2.3.RELEASE.jar, file:/Users/maki/.m2/repository/org/springframework/boot/spring-boot-starter-jdbc/1.2.3.RELEASE/spring-boot-starter-jdbc-1.2.3.RELEASE.jar, file:/Users/maki/.m2/repository/org/springframework/spring-aspects/4.1.6.RELEASE/spring-aspects-4.1.6.RELEASE.jar, file:/Users/maki/.m2/repository/org/springframework/spring-web/4.1.6.RELEASE/spring-web-4.1.6.RELEASE.jar, file:/Users/maki/.m2/repository/xml-apis/xml-apis/1.0.b2/xml-apis-1.0.b2.jar, file:/Users/maki/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/8.0.20/tomcat-embed-el-8.0.20.jar, file:/Users/maki/.m2/repository/antlr/antlr/2.7.7/antlr-2.7.7.jar, file:/Users/maki/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/1.2.3.RELEASE/spring-boot-starter-tomcat-1.2.3.RELEASE.jar, file:/Users/maki/.m2/repository/ch/qos/logback/logback-classic/1.1.3/logback-classic-1.1.3.jar, file:/Users/maki/.m2/repository/org/apache/tomcat/tomcat-juli/8.0.20/tomcat-juli-8.0.20.jar, file:/Users/maki/.m2/repository/org/aspectj/aspectjrt/1.8.5/aspectjrt-1.8.5.jar, file:/Users/maki/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar, file:/Users/maki/.m2/repository/org/springframework/spring-expression/4.1.6.RELEASE/spring-expression-4.1.6.RELEASE.jar, file:/Users/maki/.m2/repository/org/slf4j/jcl-over-slf4j/1.7.11/jcl-over-slf4j-1.7.11.jar, file:/Users/maki/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/8.0.20/tomcat-embed-websocket-8.0.20.jar, file:/Users/maki/.m2/repository/org/apache/tomcat/tomcat-jdbc/8.0.20/tomcat-jdbc-8.0.20.jar, file:/Users/maki/.m2/repository/javax/validation/validation-api/1.1.0.Final/validation-api-1.1.0.Final.jar, file:/Users/maki/.m2/repository/org/slf4j/log4j-over-slf4j/1.7.11/log4j-over-slf4j-1.7.11.jar, file:/Users/maki/.m2/repository/dom4j/dom4j/1.6.1/dom4j-1.6.1.jar, file:/Users/maki/.m2/repository/org/apache/tomcat/embed/tomcat-embed-logging-juli/8.0.20/tomcat-embed-logging-juli-8.0.20.jar, file:/Users/maki/.m2/repository/org/springframework/spring-aop/4.1.6.RELEASE/spring-aop-4.1.6.RELEASE.jar, file:/Users/maki/.m2/repository/com/fasterxml/classmate/1.0.0/classmate-1.0.0.jar, file:/Users/maki/.m2/repository/org/springframework/spring-jdbc/4.1.6.RELEASE/spring-jdbc-4.1.6.RELEASE.jar, file:/Users/maki/.m2/repository/org/springframework/boot/spring-boot/1.2.3.RELEASE/spring-boot-1.2.3.RELEASE.jar, file:/Users/maki/.m2/repository/ch/qos/logback/logback-core/1.1.3/logback-core-1.1.3.jar, file:/Users/maki/.m2/repository/org/springframework/data/spring-data-jpa/1.7.2.RELEASE/spring-data-jpa-1.7.2.RELEASE.jar, file:/Users/maki/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/8.0.20/tomcat-embed-core-8.0.20.jar, file:/Users/maki/.m2/repository/org/projectlombok/lombok/1.14.0/lombok-1.14.0.jar, file:/Users/maki/.m2/repository/org/jboss/jandex/1.1.0.Final/jandex-1.1.0.Final.jar, file:/Users/maki/.m2/repository/org/hibernate/javax/persistence/hibernate-jpa-2.1-api/1.0.0.Final/hibernate-jpa-2.1-api-1.0.0.Final.jar, file:/Users/maki/.m2/repository/org/springframework/spring-beans/4.1.6.RELEASE/spring-beans-4.1.6.RELEASE.jar, file:/Users/maki/.m2/repository/org/springframework/data/spring-data-commons/1.9.2.RELEASE/spring-data-commons-1.9.2.RELEASE.jar, file:/Users/maki/.m2/repository/org/jboss/logging/jboss-logging/3.1.3.GA/jboss-logging-3.1.3.GA.jar, file:/Users/maki/.m2/repository/org/lazyluke/log4jdbc-remix/0.2.7/log4jdbc-remix-0.2.7.jar, file:/Users/maki/.m2/repository/org/hibernate/hibernate-validator/5.1.3.Final/hibernate-validator-5.1.3.Final.jar, file:/Users/maki/.m2/repository/org/javassist/javassist/3.18.1-GA/javassist-3.18.1-GA.jar, file:/Users/maki/.m2/repository/org/slf4j/slf4j-api/1.7.11/slf4j-api-1.7.11.jar, file:/Users/maki/.m2/repository/org/hibernate/hibernate-core/4.3.8.Final/hibernate-core-4.3.8.Final.jar, file:/Users/maki/.m2/repository/org/hibernate/common/hibernate-commons-annotations/4.0.5.Final/hibernate-commons-annotations-4.0.5.Final.jar, file:/Users/maki/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/1.2.3.RELEASE/spring-boot-autoconfigure-1.2.3.RELEASE.jar, file:/Users/maki/.m2/repository/org/springframework/boot/spring-boot-starter-web/1.2.3.RELEASE/spring-boot-starter-web-1.2.3.RELEASE.jar, file:/Users/maki/.m2/repository/org/hibernate/hibernate-entitymanager/4.3.8.Final/hibernate-entitymanager-4.3.8.Final.jar, file:/Users/maki/.m2/repository/org/jboss/logging/jboss-logging-annotations/1.2.0.Beta1/jboss-logging-annotations-1.2.0.Beta1.jar, file:/Users/maki/.m2/repository/junit/junit/4.12/junit-4.12.jar, file:/Users/maki/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.4.5/jackson-annotations-2.4.5.jar, file:/Users/maki/.m2/repository/org/springframework/spring-tx/4.1.6.RELEASE/spring-tx-4.1.6.RELEASE.jar, file:/Users/maki/.m2/repository/javax/transaction/javax.transaction-api/1.2/javax.transaction-api-1.2.jar, file:/Users/maki/.m2/repository/org/springframework/boot/spring-boot-starter-logging/1.2.3.RELEASE/spring-boot-starter-logging-1.2.3.RELEASE.jar, file:/Users/maki/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.4.5/jackson-databind-2.4.5.jar, file:/Users/maki/.m2/repository/org/springframework/springloaded/1.2.3.RELEASE/springloaded-1.2.3.RELEASE.jar]
   2015-05-20 02:56:33.840  INFO 4027 --- [           main] utoConfigurationReportLoggingInitializer : 
   
   Error starting ApplicationContext. To display the auto-configuration report enabled debug logging (start with --debug)
   
   
   2015-05-20 02:56:33.841 ERROR 4027 --- [           main] o.s.boot.SpringApplication               : Application startup failed
   (略)
   
   
原因は調査中ですが、ワークアランドとしては\ ``AppConfig``\ に以下の対応を行ってください。

.. code-block:: java
   
   import org.springframework.context.annotation.Primary;
   
   @Primary // 追加
   @Bean
   DataSource dataSource() {
      return new Log4jdbcProxyDataSource(this.dataSource);
   }
