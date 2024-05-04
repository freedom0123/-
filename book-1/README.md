# 栈与队列
## 设计一个有 getMin 功能的栈

因为题目的要求是，在实现栈的基础功能的基础之上，所以说，我们使用两个栈： 

- stack 用来实现基础的栈功能
- stackMin 用来实现 getMin 的功能，栈顶元素始终是当前 stack 中，最小的元素。

接下来，我们就来看看，题目中要求的操作：

1） push：向栈中添加元素。

- 对于 stack 来说，可以直接进行添加
- 对于 stackMin ，如果栈顶元素 大于等于 num 的话，就需要添加进来，因为这个时候，num 就是 stack 之中最小的元素

2）pop：弹出栈顶的元素。

- 首先，我需要弹出 stack 的栈顶元素 num
- 如果说 stackMin 中栈顶元素是 num，就需要把 num 也弹出去。stack 中num 都不存在了，还必要在 stackMin 存在吗？

3）getMin：返回最小的元素

- 返回 stackMin 的栈顶即可





