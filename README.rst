⭐️\ **Spring Boot2**\ の本は\ `オンライン <https://note.ik.am>`_\ で執筆中です。サンプルコードは\ `こちら <https://github.com/making/hajiboot2-samples>`_\ です。⭐️


----

「はじめてのSpring Boot [改訂版]」サポートページ
********************************************************************************

「\ `はじめてのSpring Boot [改訂版] <http://www.kohgakusha.co.jp/books/detail/978-4-7775-1969-9>`_\ 」のサポートページです。

**「はじめてのSpring Boot」初版(表紙がピンク)対応のサンプルコードは**\ `こちら <https://github.com/making/hajiboot-samples/tree/1st-edition>`_\ **です。**

このページでサンプルコードと正誤表を管理します。書籍の内容に関する間違いの指摘等はIssuesかPull Requestでお願いします。

また、疑問やコメントはTwitterでハッシュタグ「\ `#hajiboot <https://twitter.com/hashtag/hajiboot?f=tweets&vertical=default>`_\ 」をつけてツイートしていただければ極力お答えします。気軽にツイートしてください。

**本の内容が最新Spring Bootでは動かないという場合もサポートいたします**\ ので、\ `Issueで報告 <https://github.com/making/hajiboot-samples/issues/new>`_\ お願いいたします。
回答の保証はありませんが、Spring Bootに関するよろず質問でもOKです。

正誤表 (第3刷)
================================================================================

.. list-table::
   :header-rows: 1

   * - 場所
     - 誤
     - 正
     - 訂正日
   * - P.135, 136 アルゴリズム名
     - ``PBKPF2``
     - ``PBKDF2``
     - 2018-04-23

正誤表 (第2刷)
================================================================================

.. list-table::
   :header-rows: 1

   * - 場所
     - 誤
     - 正
     - 訂正日
   * - P.107 ``goToTop``\ メソッドの上のアノテーション
     - ``@GetMapping(path = "edit", params = "goToTop")``
     - ``@PostMapping(path = "edit", params = "goToTop")``
     - 2017-09-19
   * - P.111 ``goToTop``\ メソッドの上のアノテーション
     - ``@RequestMapping(path = "edit", params = "goToTop")``
     - ``@PostMapping(path = "edit", params = "goToTop")``
     - 2017-09-19
   * - P.135, 136 アルゴリズム名
     - ``PBKPF2``
     - ``PBKDF2``
     - 2018-04-23
   * - P.164
     - ``application-cloud.proerties``
     - ``application-cloud.properties``
     - 2017-09-18
   * - P.176
     - ``spring.datasource.url:jdbc:h2:mem:customers;DB_CLOSE_ON_EXIT=FALSE``
     - ``spring.datasource.url:jdbc:log4jdbc:h2:mem:customers;DB_CLOSE_ON_EXIT=FALSE``
     - 2017-09-18
   * - P.179
     - ``spring.datasource.url:jdbc:h2:mem:customers;DB_CLOSE_ON_EXIT=FALSE``
     - ``spring.datasource.url:jdbc:log4jdbc:h2:mem:customers;DB_CLOSE_ON_EXIT=FALSE``
     - 2017-09-18
     
正誤表 (第1刷)
================================================================================

.. list-table::
   :header-rows: 1

   * - 場所
     - 誤
     - 正
     - 訂正日
   * - P.31 (プログラム解説)
     - (2),(3),(4) (1つずつずれている)
     - (3),(4),(5)
     - 2016-09-18
   * - P.31 (プログラム解説)
     - \- (漏れている)
     - \(2\) 「JavaConfig」を読み込むために、「@Import」で「@Configuration」アノテーション を付けた対象のクラスを指定。
     - 2016-09-18
   * - P.36 
     - \-
     - ``Frontend``\ クラスの上の\ ``@Bean``\ のインデントがずれている
     - 2016-11-07
   * - P.44
     - Appクラス
     - HajibootLayeringApplicationクラス
     - 2016-09-18
   * - P.61
     - Appクラス
     - HajibootJdbcApplicationクラス
     - 2016-09-18
   * - P.61
     - https://console.run.pivotal.io/2/
     - https://console.run.pivotal.io
     - 2016-11-07
   * - P.81 (プログラム解説)
     - (5), (5)
     - (5), (6)
     - 2016-09-18
   * - P.83 (6)
     - NO_CONTENT
     - NO CONTENT
     - 2016-11-07
   * - P.85
     - 204NoContent
     - 204 No Content
     - 2016-11-07
   * - P.86
     - ``ResponseEntity<CustomerpostCustomers(@RequestBody Customer customer, UriComponentsBuilder uriBuilder /* (1) */) {``
     - ``ResponseEntity<Customer> postCustomers(@RequestBody Customer customer, UriComponentsBuilder uriBuilder /* (1) */) {``
     - 2016-11-07
   * - P.94 (4)
     - コンテスト・パス
     - コンテキスト・パス
     - 2016-11-07
   * - P.107 ``editForm``\ メソッドの上のアノテーション
     - ``@PostMapping(path = "edit", params = "form")``
     - ``@GetMapping(path = "edit", params = "form")``
     - 2016-11-07
   * - P.107 ``goToTop``\ メソッドの上のアノテーション
     - ``@GetMapping(path = "edit", params = "goToTop")``
     - ``@PostMapping(path = "edit", params = "goToTop")``
     - 2017-09-19
   * - P.111 ``goToTop``\ メソッドの上のアノテーション
     - ``@RequestMapping(path = "edit", params = "goToTop")``
     - ``@PostMapping(path = "edit", params = "goToTop")``
     - 2017-09-19
   * - P.124 (2か所)
     - application.yml
     - application.properties
     - 2016-09-09
   * - P.124
     - ``security.basic.enabled: false``
     - ``security.basic.enabled=false``
     - 2016-09-09
   * - P.129 下
     - ``return new Pbkdf2PasswordEncoder(); // ()``
     - ``return new Pbkdf2PasswordEncoder(); // (9)``
     - 2016-11-07
   * - P.130 下
     - (10)の行
     - 不要 (初版の残り)
     - 2016-11-07
   * - P.133 (1)
     - 「loginForm?error=true」に遷移するように
     - 「loginForm?error」に遷移するように
     - 2016-11-07
   * - P.134 下
     - ``<p><span sec:authentication="principal.user.username">duke</span>さんログイン中。</p>``
     - この3行削除 (P. 141で登場）
     - 2016-11-07
   * - P.135
     - ``src/main/resources/migration/V3__add_user.sql`` (2箇所)
     - ``src/main/resources/migration/V3__add-user.sql``
     - 2016-11-07
   * - P.135, 136 アルゴリズム名
     - ``PBKPF2``
     - ``PBKDF2``
     - 2018-04-23
   * - P.151
     - 2つ目の (1)
     - \(2\)
     - 2016-11-07
   * - P.152
     - https://console.run.pivotal.io/2/
     - https://console.run.pivotal.io
     - 2016-11-07
   * - P.164
     - ``application-cloud.proerties``
     - ``application-cloud.properties``
     - 2017-09-18
   * - P.171
     - \-
     - [4.7]の前に「\ `Spring Cloud Connectorsのコネクションプールに関する設定 <https://github.com/making/hajiboot-samples/blob/master/README.rst#spring-cloud-connectorsのコネクションプールに関する設定>`_\ 」を追加
     - 2016-11-07
   * - P.176
     - ``spring.datasource.url:jdbc:h2:mem:customers;DB_CLOSE_ON_EXIT=FALSE``
     - ``spring.datasource.url:jdbc:log4jdbc:h2:mem:customers;DB_CLOSE_ON_EXIT=FALSE``
     - 2017-09-18
   * - P.179
     - ``spring.datasource.url:jdbc:h2:mem:customers;DB_CLOSE_ON_EXIT=FALSE``
     - ``spring.datasource.url:jdbc:log4jdbc:h2:mem:customers;DB_CLOSE_ON_EXIT=FALSE``
     - 2017-09-18

補足
================================================================================

"[4.6.4] 「Spring Boot Actuator」で「アプリケーションの状態」を監視"のSpring Boot 1.5対応
--------------------------------------------------------------------------------

Spring Boot 1.5から、「Spring Boot Actuator」のエンドポイントに対して、自動で認可設定が行われるようになりました。
[3.5]で説明したSpring Securityを使用し、認証ユーザーに対して"ROLE_ACTUATOR"ロールを付与する事で、
認証後に「Spring Boot Actuator」のエンドポイントにアクセスできます。

あるいは\ ``application.properties``\ に

.. code-block:: properties

   management.security.enabled=false


を設定する事で、「Spring Boot Actuator」に対する認可制御を無効にできます。


Spring Cloud Connectorsのコネクションプールに関する設定
--------------------------------------------------------------------------------

``AbstractCloudConfig``\ のデフォルト設定ではコネクションプールに関する設定が固定されてしまいます。コネクションプールに関する設定を行う場合は、次のように\ ``PooledServiceConnectorConfig.PoolConfig``\ クラスを使用します。

.. code-block:: java

   package com.example;

   import javax.sql.DataSource;

   import org.springframework.cloud.config.java.AbstractCloudConfig;
   import org.springframework.cloud.service.PooledServiceConnectorConfig;
   import org.springframework.cloud.service.relational.DataSourceConfig;
   import org.springframework.context.annotation.Bean;
   import org.springframework.context.annotation.Configuration;
   import org.springframework.context.annotation.Profile;

   @Configuration
   @Profile("cloud")
   public class CloudConfig extends AbstractCloudConfig {
       @Bean
       DataSource dataSource() {
           PooledServiceConnectorConfig.PoolConfig poolConfig = new PooledServiceConnectorConfig.PoolConfig(
                   5 /* 最小プール数 */, 30 /* 最大プール数 */, 3000 /* 最大待機時間 */);
           return connectionFactory().dataSource(new DataSourceConfig(poolConfig, null));
       }
   }

実は[4.6.3]で説明したAuto-Reconfigurationを利用すると次のログが出力されていました。

.. code-block:: console

   org.apache.tomcat.jdbc.pool.ConnectionPool         WARNING maxIdle is larger than maxActive, setting maxIdle to: 4``

これはAuto-Reconfiguration側で最大接続数を4に指定しているからです(バックエンドサービスの無償枠向け)。[14]

基本的にはspring-cloud-connectorを使って、コネクションプールの設定をすべきです。

[14] .. https://discuss.pivotal.io/hc/en-us/articles/221898227-Connection-pool-warning-message-maxIdle-is-larger-than-maxActive-setting-maxIdle-to-4-seen-in-PCF-deployed-Spring-app

「[4.5.4] アプリケーションのログ」で言及されているログマネージャーとの連携方法
--------------------------------------------------------------------------------

https://github.com/Pivotal-Japan/cf-workshop/blob/master/logging.md
に記載しました。

PCF Devについて
--------------------------------------------------------------------------------
\ `PCF Dev <http://pcfdev.io>`_\ は開発用にローカル環境で簡単にCloud Foundryを試すためのVM環境です。Pivotal Cloud Foundryが提供しているサービス(MySQL、Redis、RabbitMQ)も初めから組み込まれていて、Virtual Boxだけで簡単にローカル開発環境を用意できます。

書面では名前だけ挙げて、使い方を紹介していないため、
PCF Devの使い方は\ `こちら <https://github.com/Pivotal-Japan/cf-workshop/blob/master/pcf-dev.md>`_\ を参照してください。

FAQ
================================================================================

PCF Devで本のサンプルアプリをデプロイできない
--------------------------------------------------------------------------------

Spring Boot 1.4からはjarのレイアウトが変わり、Cloud Foundryで動かすには\ `Java Buildpack 3.7以上が必要 <https://github.com/pivotal-cf/pcfdev/issues/130>`_\ になります。\ `PCF Dev v.0.20.0 <https://network.pivotal.io/products/pcfdev#/releases/2298>`_\ 以上を使用してください。


PCF Dev v0.19以下の場合の対応方法は\ `こちら <http://bit.ly/pcfdev-boot14>`_\ を参照してください。

