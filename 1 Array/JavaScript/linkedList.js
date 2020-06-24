function List () {
  // 节点
  let Node = function (element) {
    this.element = element
    this.next = null
  }
  // 初始头节点为 null
  let head = null
  
  // 链表长度
  let length = 0
  // 操作
  this.getList = function() {return head}
  this.search = function(list, element) {}
  this.append = function(element) {
    let node = new Node(element),
        p = head
    if (!head){
      head = node
    } else {
      while (p.next) {
        p = p.next
      }
      p.next = node
    }
    length += 1
  }
 
  return list;
  
}




// 测试
let list = new List()
for(let i = 0; i < 5; i+=1) {
  list.append(i)
}

