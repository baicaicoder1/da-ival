let addDagContent = function () {
    let add_dag_content =layer.open({
        title:'新建Task',
        type: 2,
        area: ['800px','600px'],
        content: '../addDagContent' //这里content是一个URL，如果你不想让iframe出现滚动条，你还可以content: ['http://sentsin.com', 'no']
    });
}