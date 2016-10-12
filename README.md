# CircleOneLeft
This is a little game that all ppl are standing in a circle, from the first guy, counts 1, next counts 2. The third one who counts 3 are out. And so forth...till the last lucky guy was left as winner.


CircleOneLeft.java
------
This file "CircleOneLeft.java" is written in a "process-oriented" perspective, and outputs more details during the game. Moreover, it allows you to take part in the game by choosing a place among the circle.

![CMD line_screen shot_CircleOneLeft](https://trello-attachments.s3.amazonaws.com/57fc84a7abab7e64aec30bed/431x652/d73e36a8627523c1d0d61be0ad67e802/Capture.PNG.png)

- command(s): 
   1. javac CircleOneLeft.java
   2. java CircleOneLeft 4 1


CircleOneLeftObject.java
------
This file "CircleOneLeftObject.java" was created in a perspective of "object-oriented", same game, only that you can not take part in the game.

![CMD line_screen shot_CircleOneLeftObject](https://trello-attachments.s3.amazonaws.com/57fc84a7abab7e64aec30bed/488x214/f321e104264924404736a52c08f5e6ac/Image_1.png)

- command(s): 
   1. javac CircleOneLeftObject.java
   2. java CircleOneLeftObject 4
   

CircleOneLeftChainedList
----
This file "CircleOneLeftChainedList.java" use a array - chained list (table) to solve this prolem, very classic. i.e. initialize an int array with array[i] = i++, and the array should be ended with a zero. e.g. intArray [5] = {1, 2, 3, 4, 0}; it , to some sense, forms a circle if we connect the if we want to remove the array's index with its value [0]-1, [1]-2, [2]-3, [3]-4, [4]-0. Hence that, if we want to remove one of the array member, let's assume that we are going to remove the "chaine" intArray[3], we can simply achieve that by setting [3-1] = intArray[3]. Then the new array become: [0]-1, [1]-2, [2]-4, <[3]-3>, [4]-0, if we negelect the <[3]-3>, the new chain is 0 - 1 - 2 - 4 - 0.

![CMD line_screen shot_CircleOneLeftChainedList](https://trello-attachments.s3.amazonaws.com/57fc84a7abab7e64aec30bed/371x98/817caeccc5f651f0da55586715d62eb3/upload_10_13_2016_at_12_04_48_AM.png)

- command(s): 
   1. javac CircleOneLeftChainedList.java
   2. java CircleOneLeftObject 4
