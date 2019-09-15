1、二维数组中查找一个数-FindNumInArray.java

在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

2、字符串替换-ReplaceSpace.java

请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。

3、从尾到头打印链表-ReverseList.java

4、重建二叉树-ReconstructBinaryTree.java(递归)

通过前序遍历和中序遍历结果重建二叉树

5、用两个栈实现队列-StackToQueue.java

6、旋转数组的最小数字-MinNumberInRotateArray.java(二分查找)

7、斐波拉契数列-Fibonacci.java(动态规划)

8、二进制1的数量-NumberOf1.java（位运算）

将数字每次与比他小1的数异或，得到的数再进行同样的操作

9、数值的整数次方-Power.java

a^n = a^(n/2)*a^(n/2)简化运算

10、调整顺序使奇数和偶数分开，奇数在偶数前面，但是相对顺序不变-ReOrderArray.java

插入排序的变体，每遍历到一个奇数，然后与前面的数交换

11、输出链表的倒数第k个节点-FindKthToTail.java

链表输出一定不要忘记双指针法

12、合并两个有序的链表-MergeList.java

利用归并排序的思想

13、判断二叉树B是不是二叉树A的子结构-HasSubtree.java

先找到A树的哪个节点和B的根相同，找到相同的再递归查找

14、二叉树的镜像-MirrorTree.java

直接递归，遇到节点就交换左右子树，直到遍历到所有的叶子节点

15、输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字-PrintMatrix.java

细心

16、包含min函数（能取最小值）的栈-MinStack.java

两个栈，一个存储数据，一个存储最小值

17、栈的弹出弹出序列-IsPopOrder.java

两个数组，第一个数组为弹入序列，第二个是否可能是弹出序列

构建一个栈，第一个数组往里压数据的同时，判断栈顶是不是第二个数组的头，
然后如果相等，栈顶弹出，第二个数组右移指针。
如果最后第一个数组压完后，判断是不是同时也pop完。

18、从上往下打印出二叉树的每个节点，同层节点从左至右打印-PrintTree.java

构建一个队列，先offer进头节点，然后，如果队列不为空，就poll出队列的队头，同时offer入二叉树的左右子树。

19、二叉搜索树的后序序列-VerifySquenceOfBST.java

判断一个数组是不是二叉搜索数的后序序列

首先因为是二叉搜索树，又是后序遍历，所以数组的最后一个肯定是根节点。然后遍历前面的部分，先找到第一个比它大的数字，那么这个数字前面肯定是根节点的左子树，然后判断这个数后面是不是都大于root，成立的话，继续对左右子树进行递归。

20、二叉树和为某一值的路径-FindPathInBinarryTree.java

递归，截止条件为节点和等于target，并且最后的节点为叶子节点

21、将二叉搜索树转化为排序的双向链表-ConvertToLinkedList.java

利用树的中序遍历就可以实现遍历的顺序了。

22、字典序的排列-Permutation.java

23、数组中超过一半的数字-MoreThanHalfNum.java

先排序，然后取中间的值。如果这个数超过一半，那么肯定就是这个数。然后再验证一下这个数是不是达到半数

24、最小的k个数-GetLeastNumbers.java

通过优先队列来构建最大堆，这也是大数据量应该去这么做的

25、连续子数组的最大和-FindGreatestSumOfSubArray.java

通过stack去存储最大的子数组的和，如果减小了，就不存进去。

26、整数中1出现的次数（从1到n的集合-NumberOf1Between1AndN.java

数学推理

27、第一个只出现一次的字符串-FirstNotRepeatingChar.java

利用HashMap来存储每个字符和出现的次数

28、两个链表的第一个公共节点-FindFirstCommonNode.java

利用两个栈来存储链表的节点。再将两个栈同时pop，如果pop的不是一个Node，则是需求的Node


29、数字在排序数组中出现的次数-GetNumberOfK.java

二分查找，找出第一个和最后一个

30、二叉树的深度-TreeDepth.java

简单递归

31、判断一颗二叉树是不是平衡二叉树-IsBalancedTree.java

递归求左子树和右子数的深度，在递归的过程中，如果发现左子树和右子树的深度差大于1，那么就返回false

32、数组中只出现一次的数字-FindNumsAppearOnce.java

33、和为S的连续正数序列-FindContinuousSequence.java

双指针法，由于是连续的，差为1的一个序列，那么求和公式是(a0+an)*n/2

34、和为S的两个数字-FindNumbersWithSum.java

依旧是双指针法

35、左旋转字符串-LeftRotateString.java

虽然可以使用StringBuilder，但是这样未免不符合面试官要求

所以这里使用：YX = (XT YT)T，但是注意左移的位数先取余，避免重复计算

36、翻转单词顺序序列-ReverseSentence.java

先整体翻转，再逐个单词翻转

37、扑克牌顺子-IsContinuous.java

给你n张牌，其中大小王（为0）可以代替任意数字，这五张牌能不能组成顺子

先排序，然后统计大小王的个数

38、圆圈中最后剩下的数-LastRemaining.java

链表模拟约瑟夫环，当前的数+m-1与当前size相取余

38、不使用乘除和循环判断语句计算1-n的和-Sum_Solution.java

短路与代替if

39、不用加减乘除实现加法-Add.java

while (num2!=0) {
            int temp = num1^num2;
            num2 = (num1&num2)<<1;
            num1 = temp;
        }

40、构建乘积数组-MultiplyArray.java

构建矩阵

41、表示数值的字符串-IsNumeric.java

判断一个字符串能不能表示一个数

42、字符流中第一个不重复的字符-FirstAppearingOnce.java

利用哈希表

43、链表中环的入口节点-EntryNodeOfLoop.java

先求出是否有环，如果有环，继续遍历，遍历回来计算环的长度m。再用快慢指针，第一个指针先走m步，后一个指针再走，当两个指针再次相遇则是环的入口。

44、删除链表中重复的节点-DeleteDuplication.java(重复节点不保留)

三个指针，分别指向头指针，当前指针，当前指针的前一个

45、二叉树的下一个节点-GetNext.java

其中二叉树包含父亲节点next

如果这个节点有右子树，则返回右子树最左的子节点，否则先判断其是不是其父亲节点的左子树，则返回父亲节点

46、判断二叉树是否对称-IsSymmetricalTree.java

利用栈或者递归，左子树等于右子树，右子树等于左子树

47、按之顺序打印二叉树-PrintZhi.java

利用两个栈存储奇数和偶数层

48、按层打印二叉树-PrintLayer.java

49、滑动窗口的最大值-MaxInWindows.java

建立一个deque

50、剪绳子-CutRope.java

51、最长子序列和-MaxSubSum.java










