## Problem

The current selected programming language is Java. We emphasize the submission of a fully working code over partially correct but efficient code. Once submitted, you cannot review this problem again. You can use System.outprintIno to debug your code. The SystemoutprintIno may not work in case of syntax/runtime error. The version of 31)K being used is 1.8. Amazon Music is working on a new feature to pair songs together to play while on the bus. The goal of this feature is to select two songs from a list that will end exactly 30 seconds before the listener reaches their stop. You are tasked with writing the method that selects the songs from a list. Each song is assigned a unique ID, numbered from 0 to N-1. 
Assumptions: 1. You will pick exactly 2 songs 2. You cannot pick the same song twice 3. If you have multiple pairs with the same total time, select the pair with the longest song. Input The input to the function/method consists of two arguments - rideDuration, an integer representing the duration of the ride in seconds. songDurations, a list of integers representing the duration of the songs. 
Output Return a list of integers representing the IDs of two songs whose combined runtime will finish exactly 30 seconds before the rider reaches their stop. 
Example Input: rideDuration= 90 songDurations= [1,10, 25, 35, 60] 
Output: [2, 3] 
Explanation: During the ride duration of 90 seconds, the rider listens to the third(ID-2) and fourth(ID-3} song which end exactly 30 seconds before the bus arrives at their stop. 
