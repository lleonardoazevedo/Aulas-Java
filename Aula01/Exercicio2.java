????   < T  
exercicio2  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lexercicio2; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Digite a sua idade em dias: 
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I , java/lang/StringBuilder .  A sua idade em anos é igual a: 
 + 0  &
 + 2 3 4 append (I)Ljava/lang/StringBuilder; 6  anos
 + 8 3 9 -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 + ; < = toString ()Ljava/lang/String; ? !A sua idade em meses é igual a:  A  meses C  A sua idade em dias é igual a:  E  dias
  G H  close args [Ljava/lang/String; anos I meses dias idadeEmDias leia Ljava/util/Scanner; 
SourceFile exercicio2.java !               /     *? ?    
                    	           ?>? Y? ? :? ? !? '6ml<? ? +Y-? /? 15? 7? :? !l=? ? +Y>? /? 1@? 7? :? !mh`h`>? ? +YB? /? 1D? 7? :? !? F?    
   2    	         %  @  F  a  n  ?  ?     >    ? I J   % k K L  F J M L   ? N L   r O L   ? P Q   R    S