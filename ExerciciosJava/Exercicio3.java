����   < O  
Exercicio3  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LExercicio3; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   -Entre com a duração do evento em segundos: 
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I , java/lang/StringBuilder . Seu evento vai durar 
 + 0  &
 + 2 3 4 append (I)Ljava/lang/StringBuilder; 6  horas, 
 + 8 3 9 -(Ljava/lang/String;)Ljava/lang/StringBuilder; ;  Minutos, e  = 	 segundos
 + ? @ A toString ()Ljava/lang/String;
  C D  close args [Ljava/lang/String; segundos I minutos horas leia Ljava/util/Scanner; 
SourceFile Exercicio3.java !               /     *� �    
                    	       �     i� Y� � :� � !� '<<l=<l>� � +Y-� /l� 15� 7p<l� 1:� 7p<p� 1<� 7� >� !� B�    
   * 
            $  =  `  c  h     4    i E F    O G H   J I H  $ E J H   ] K L   M    N