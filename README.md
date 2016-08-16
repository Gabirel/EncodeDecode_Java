# EncodeDecode_Java

## Brief
This reposity includes encrption(md5, sha-*) and decrpytion. Simple few lines code. Do it as simple as I can.

## Features
The code is small, and easy to understand. You won't get too long to understand it.

Also, it is easy to customize, especially `getSHA()`

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
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm[algorithmOption]);` 
        ```

		That's how it works.

2. String plainText
		just something you want to encode

3. Boolean LetterCase)
		'false' ==> 'Lowercase'
        'true' ==> 'Uppercase'


# Author
[Gabriel](http://github.com/Gabirel)


# Bugs && Feedback
If you find something strange, you can write in [here](https://github.com/Gabirel/EncodeDecode_Java/issues)