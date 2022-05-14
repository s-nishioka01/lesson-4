# 第4回講義課題

## 課題の内容
Spring Boot + Thymeleaf + MyBatisを用いてCRUD処理（Read処理のみ）を実装したアプリケーションを作成。

## アプリケーションの内容
- ハリウッド俳優の名前と年齢を格納したデータベースを用意して、それを年齢の降順で並べ替えてブラウザに表示させるアプリケーション。
- ActorController.javaでブラウザからリクエストを取得、ActorMapper.javaでActorMapper.xmlに記載されたSQLを呼び出しActorクラスに紐づけてコントローラーに渡す。index.htmlのthymeleafで取得したデータベースをHTMLに渡す。CSSを反映させてブラウザに表示。（この説明文自体正しいことを書けているのかわからないのでご指摘いただけるとありがたいです。）  
（ActorController.java, ActorMapper.java, ActorMapper.xml, index.htmlに関しては特に不安なので細かく確認していただきたいです...）

## 構成要件
Java 17  
Gradle 7.4.1  
Spring Boot 2.6.7  
Docker Desktop 4.8.7  
Docker Compose 2.5.0  
MySQL 5.7.38  
MyBatis Spring Boot Starter 2.2.2  
（バージョンの記載の仕方合っているでしょうか...?他に記載すべきもの、不要なものはあるでしょうか？）

## データベースの内容

### データ構造
| 論理名　| 物理名 | 型 | 長さ | 必須 | 主キー |
|----|----|----|----|----|----|
| ID | id | INT | 10 | Y | Y |
| 名前 | name | VARCHAR | 100 | Y |  |
| 年齢 | age | INT | 10 | Y |  |

### 格納データ
| id | name | age |
|----|----|----|
| 1 | Leonardo DiCaprio | 47 |
| 2 | Eddie Redmayne    | 40 |
| 3 | Will Smith        | 53 |
| 4 | Rami Malek        | 41 |
| 5 | Gary Oldman       | 64 |
| 6 | Tom Hanks         | 65 |

## 実行結果
取得したデータを年齢をもとに降順に並べかえ、テーブルにCSSを反映させて表示。
<img width="1129" alt="実行結果スクリーンショット" src="https://user-images.githubusercontent.com/103230014/168340064-cda06c5d-8118-4557-9405-f784330cd830.png">




