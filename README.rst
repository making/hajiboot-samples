「はじめてのSpring Boot」サポートページ
********************************************************************************

「\ `はじめてのSpring Boot <http://www.kohgakusha.co.jp/books/detail/978-4-7775-1865-4>`_\ 」のサポートページです。

このページでサンプルコードと正誤表を管理します。書籍の内容に関する間違いの指摘等はIssuesかPull Requestでお願いします。

また、疑問やコメントはTwitterでハッシュタグ「#hajiboot」をつけてツイートしていただければ極力お答えします。気軽にツイートしてください。


正誤表
================================================================================

.. list-table::
   :header-rows: 1

   * - 場所
     - 誤
     - 正
     - 補足
   * - P.21 中央よりやや下
     - \ ``<version>1.2.0.RELEASE</version>``\ 
     - \ ``<version>1.2.1.RELEASE</version>``\ 
     - 
   * - P.54 \ ``realDataSource``\ を定義する箇所
     - \ ``@Bean``\ 
     - \ ``@Bean(destroyMethod = "close")``\ 
     - 
   * - P.58 項番(1)
     - (b) 「エラーが発生した場合」は 
     - (b) 「\ **実行時例外が**\ 発生した場合」は
     - *1
   * - P.68 中央のAppクラスの説明
     - \ ``customerRepository.finadAllOrderById()``\ 
     - \ ``customerRepository.finadAllOrderByName()``\ 
     - 
   * - P.69 ノート
     - \ ``List<Customer> finadAllOrderById()``\ 
     - \ ``List<Customer> finadAllOrderByName()``\ 
     - 

*1 ... チェック例外の場合はロールバックされません
