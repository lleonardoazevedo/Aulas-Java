����   < T  
Exercicio1  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LExercicio1; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   0Digite a sua idade em anos, meses e dias!
Anos: 
 " $ # java/io/PrintStream % & printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
  ( ) * nextInt ()I , ha quantos meses: 
 " . / 0 print (Ljava/lang/String;)V 2 Digite a quantos dias:  4 java/lang/StringBuilder 6 .A sua idade em quantidade de dias é igual a: 
 3 8  0
 3 : ; < append (I)Ljava/lang/StringBuilder; >  dias! 
 3 @ ; A -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 3 C D E toString ()Ljava/lang/String;
  G H  close args [Ljava/lang/String; anos I meses dias 	idadeDias leia Ljava/util/Scanner; 
SourceFile Exercicio1.java !               /     *� �    
                    	       �     q� Y� � :� � � !W� '<� +� -� '=� 1� -� '>mhh``6� � 3Y5� 7� 9=� ?� B� -� '<� F�    
   2           '  -  5  ;  I  e  k  p     >    q I J    R K L  - D M L  ; 6 N L  I ( O L   e P Q   R    S