# 第4回講義課題

## 課題の内容
Spring Boot + Thymeleaf + MyBatisを用いてCRUD処理（Read処理のみ）を実装したアプリケーションを作ってみる。

## アプリケーションの内容
- ハリウッド俳優の名前と年齢を格納したデータベースを用意して、それを年齢の降順で並べ替えてブラウザに表示させるアプリケーションです。
- 確認していただきたいファイルは次の通りです。
  ActorController.java, Actor.java, ActorMapper.java, ActorMapper. xml, application.yml

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
<img width="1129" alt="実行結果スクリーンショット" src="https://user-images.githubusercontent.com/103230014/168340064-cda06c5d-8118-4557-9405-f784330cd830.png">




