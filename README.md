 EncodeDecode_Java

## Brief
This reposity includes encrption(md5, sha-*) and decrpytion. Simple few lines code. Do it as simple as I can.

## Features
The code is small, and easy to understand. You won't get too long to understand it.

Also, it is easy to customize, especially `getSHA()`


- - -


### EncodeOneway.java
#### GENERAL
This source file includes only two functions. They are as followed:
```java
//This function will give you a 16-bit or 32-bit md5
public String getMD5(int bits, String plainText, Boolean LetterCase) {
   ...
}

//This function can give you sha1, sha224, sha256, sha384 and sha512
public String getSHA(int algorithmOption, String plainText, Boolean LetterCase){
    ...
}
```

#### Parameter Explantion
##### getMD5()
1. int bits:

		'16' ==> 'generate 16bits hash'
		'32' ==> 'generate 32bits hash'

2. String plainText:

        just something you want to encode

3. Boolean LetterCase:

		'false' ==> 'Lowercase'
        'true' ==> 'Uppercase'


#### getSHA()
1. int algorithmOption:

	- Value:
	
        	'0' ==> 'SHA-1'
            '1' ==> 'SHA-224'
            '2' ==> 'SHA-256'
            '3' ==> 'SHA-384'
            '4' ==> 'SHA-512'
	- How does it work
		Inside `getSHA()`, there's a String array:
        ```java
        	String[] algorithm = {
            		"SHA-1", "SHA-224", 
                    "SHA-256", "SHA-384", "SHA-512"
            };
		```
        If you want to encode with `SHA-1`, just use 
        ```java
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm[algorithmOption]);
        ```

		That's how it works.

2. String plainText:

		just something you want to encode

3. Boolean LetterCase:

		'false' ==> 'Lowercase'
        'true' ==> 'Uppercase'


-----

### EncodeReversible.java
#### GENERAL
In EncodeReversible.java, there's only two functions. They are as followd:
```java
//This stupid function will give you Base64(Encoding)
public String getBase64(String plainText){
	...
}


//This stupid function will give you URL-encoded String/Text
public String getURLEncoded(String plainText){
	...
}
```

#### Parameter Explantion
##### getBase64()
1. String plainText:

        just something you want to encode


##### getURLEncoded()
1. String plainText:

		just something you want to encode


#### Something else
1. About using `java.util.Base64`

        I use newest `java.util.Base64`. Because it is faster than `com.sum.misc` and `org.apache.commons.codec.binary`. I recommend you to use this too.

2. Reference

		https://magiclen.org/java-base64/

        PS： I hope you understand traditonal Chinese. Otherwise, don't look at it.




- - -


### Decode.java
#### GENERAL
In this damn source file, you can only find two functions AGAIN.
```java
//This can decode damn Base64 value into human-readable string
public String reverseBase64(String cipherText) {
	...
}


//This can decode encoded version of URL
public String reverseURLEncode(String urlEncodedText){
	...
}
```


#### Parameter Explantion
##### reverseBase64()
1. String cipherText:

		just something you want to decode


##### reverseURLEncode()
1. String cipherText()

		just something you want to decode



- - -


# Author
[Gabriel](https://github.com/Gabirel)


# Bugs && Feedback
If you find something strange, you can write in [here](https://github.com/Gabirel/EncodeDecode_Java/issues)
