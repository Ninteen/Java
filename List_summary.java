//ArrayList 实现了 RandomAccess 接口， 而 LinkedList 没有实现。为什么呢？我觉得还是和底层数据结构有关！ArrayList 底层是数组，而 LinkedList 底层是链表。数组天然支持随机访问，时间复杂度为 O（1），所以称为快速随机访问。链表需要遍历到特定位置才能访问特定位置的元素，时间复杂度为 O（n），所以不支持快速随机访问。，ArrayList 实现了 RandomAccess 接口，就表明了他具有快速随机访问功能。 RandomAccess 接口只是标识，并不是说 ArrayList 实现 RandomAccess 接口才具有快速随机访问功能的！

//下面再总结一下 list 的遍历方式选择：

//实现了 RandomAccess 接口的list，优先选择普通 for 循环 ，其次 foreach,
//未实现 RandomAccess接口的list，优先选择iterator遍历（foreach遍历底层也是通过iterator实现的,），大size的数据，千万不要使用普通for循环

// 调用别人的服务获取到list
List<Integer> list = otherService.getList();
if (list instanceof RandomAccess) {
    // 内部数组实现，可以随机访问
    System.out.println(list.get(list.size() - 1));
} else {
    // 内部可能是链表实现，随机访问效率低
}
