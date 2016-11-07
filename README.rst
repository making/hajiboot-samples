「はじめてのSpring Boot [改訂版]」サポートページ
********************************************************************************

「\ `はじめてのSpring Boot [改訂版] <http://www.kohgakusha.co.jp/books/detail/978-4-7775-1969-9>`_\ 」のサポートページです。

**「はじめてのSpring Boot」初版(表紙がピンク)対応のサンプルコードは**\ `こちら <https://github.com/making/hajiboot-samples/tree/1st-edition>`_\ **です。**

このページでサンプルコードと正誤表を管理します。書籍の内容に関する間違いの指摘等はIssuesかPull Requestでお願いします。

また、疑問やコメントはTwitterでハッシュタグ「\ `#hajiboot <https://twitter.com/hashtag/hajiboot?f=tweets&vertical=default>`_\ 」をつけてツイートしていただければ極力お答えします。気軽にツイートしてください。

**本の内容が最新Spring Bootでは動かないという場合もサポートいたします**\ ので、\ `Issueで報告 <https://github.com/making/hajiboot-samples/issues/new>`_\ お願いいたします。
回答の保証はありませんが、Spring Bootに関するよろず質問でもOKです。

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
     - App クラス
     - HajibootLayeringApplicationクラス
     - 2016-09-18
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
   * - P.107 ``editForm``\ メソッドの上のアノテーション
     - ``@PostMapping(path = "edit", params = "form")``
     - ``@GetMapping(path = "edit", params = "form")``
     - 2016-11-07
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

補足
================================================================================

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

