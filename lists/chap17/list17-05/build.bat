@echo off           '二重に画面表示がなされることを防ぐ宣言
javac *.java        'コンパイル
java AllTests       'テスト
javadoc *.java      'javadoc生成