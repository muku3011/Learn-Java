## Problem

The current selected programming language is Java. We emphasize the submission of a fully working code over partially correct but efficient code.
Once submitted, you cannot review this problem again. You can use System.out.println to debug your code.
The System.out.println() may not work in case of syntax/runtime error. The version of JDK being used is 1.8.

James is working on a system that divides applications to a mixed cluster of computing devices. Each application is identified by an integer ID.
requires a fixed non-zero amount of memory to execute, and is defined to be either a foreground or background application.
IDs are guaranteed to be unique within their own application type, but not across types.

Each device should be assigned two applications at once. one foreground application and one background application.
Devices have limited amounts of memory and cannot execute applications that require more memory than the available memory.
The goal of the system is to maximize the total utilization of the memory of a given device.
EagerInitialization foreground/background application pair is considered to be optimal if there does not exist another pair that uses more memory than this pair,
and also has a total less than or equal to the total memory of the device. For example.
If the device has 10MB memory, a foreground/background pair using a sum total of 9MB memory would be optimal if there does not exist a pair 
that uses a sum total of 10 MB. but would not be optimal if such a pair did exist. 
Write an algorithm to help James find the sets of foreground and background application pairs that optimally utilize the given device for a
given list of foreground applications and a given list of background applications. Input The input to the function/method consists of three
arguments cleviceCapacity, an integer representing the maximum capacity of the given device: foregroundAppList a list of pairs of integers
where the first integer represents the unique ID of a foreground application and the second integer represents the amount of memory 
required by this application: backgroundAppList. a list of pairs of integers where the first integer represents the unique ID of a 
background application and the second integer represents the amount of memory required by this application. 

Output Return a list of pairs of integers representing the pairs of IDs of foreground and background applications that optimally utilize the given device. If no pair is possible. return a list with empty pair. 
Examples Example 1: Input cleviceCapacity=7 foregroundAppList= 1[1.2).[2.4].13.611 backgroundAppList= (p2]] 
Output ([2.1)] 
Explanation: There are only three combinations.11.11.12.1]. and (3.1]. which use a total of 4. 6. and 8 MB memory. respectively. Since 6 is the largest use that does not exceed 7.12.1) is the only optimal pair. 
Example 1 Input cleviceCapacity= 10 foregroundAppList = [(1. 3]. [2. 5]. [3. 7]. (4.101] backgroundAppList= ([1.2]. [2. 3]. [3.4]. (4. 5)] 
Output ([2.4]. [3.211 
Explanation: There are two pairs of foreground and background applications possible that optimally utilizes the given device. Application 2 from foregroundAppList uses S memory units and application 4 from backgroundAppList also uses 5 memory units. Combined, they add up to 10 units of memory. Similarly, application 3 from foregroundAppList uses 7 memory units, and application 2 from backgroundAppList uses 3 memory units. These also add up to 10 units of memory. Therefore, the pairs of foreground and background applications that optimally utilize the device are [2.4] and [3. 2]. 
