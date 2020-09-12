const vm = new Vue({
  el: '#app',
  data:{
    books:[
        {
          id: 1,
          name: '《算法导论》',
          date: '2006-9',
          price: 85.00,
          count: 1
        },{
          id: 2,
           name: '《UNIX编程艺术》',
           date: '2006-2',
           price: 59.00,
           count: 1
        },{
           id: 3,
           name: '《编程珠玑》',
           date: '2008-10',
           price: 39.00,
           count: 1
        },{
           id: 4,
           name: '《代码大全》',
           date: '2006-3',
           price: 185.00,
           count: 8
        }
    ]
  },
  methods:{
    // getFinalPrice(price){
    //   return '￥' + price.toFixed(2);
    // }
    addClick(index){
      console.log(index);
      this.books[index].count++;
    },
    delClick(index){
      this.books[index].count--;
    },
    removeClick(index){
      this.books.splice(index,1);
    }
  },
  filters:{
    showPrice(price){
      return '￥' + price.toFixed(2);
    }
  },
  computed:{
    totalPrice(){
      let sum = 0;
      // for(let i = 0; i < this.books.length; i++){
      //   sum += this.books[i].price * this.books[i].count;
      // }
      // return sum;

      // for(let i in this.books){
      //   sum += this.books[i].price * this.books[i].count;
      // }
      // return sum;

      // for(let i of this.books){
      //   sum += i.price * i.count;
      // }
      // return sum;
      return this.books.reduce(function (preValue,book) {
        return preValue + book.price * book.count;
      },0)
    }
  }
})

const nums =[10,20,111,222,444,40,50];
let total = nums.filter(function (n) {
  return n < 100;
}).map(function (n) {
  return n * 2;
}).reduce(function (prevValue,n) {
  return prevValue + n;
},0)
console.log(total)



















