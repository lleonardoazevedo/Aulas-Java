����   < W  
Exercicio6  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LExercicio6; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Entre com o valor de x1: 
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I , Entre com o valor de y1:  . Entre com o valor de y2: @       
 2 4 3 java/lang/Math 5 6 pow (DD)D
 2 8 9 : sqrt (D)D < java/lang/StringBuilder > resultado final é de: 
 ; @  &
 ; B C D append (D)Ljava/lang/StringBuilder;
 ; F G H toString ()Ljava/lang/String; args [Ljava/lang/String; x1 D x2 y1 y2 p1 p2 	resultado leia Ljava/util/Scanner; 
SourceFile Exercicio6.java !               /     *� �    
                    	      2     �� Y� � :� � !� '�H� +� !� '�9� � !� '�J� -� !� '�9)'c /� 19	c /� 19c� 79� � ;Y=� ?� A� E� !�    
   :           #  +  3  :  B  J  U  b  l  � #    \ 	   � I J    i K L  : J M L  + Y N L  J : O L  U / P L 	 b " Q L  l  R L   x S T   U    V