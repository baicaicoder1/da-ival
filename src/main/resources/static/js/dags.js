var addDag = function () {
    let add_dag =layer.open({
        title:'新建项目',
        type: 2,
        area: ['700px', '220px'],
        content: './addDags' //这里content是一个URL，如果你不想让iframe出现滚动条，你还可以content: ['http://sentsin.com', 'no']
    });
}