new Vue({
    el:"#app",
    data:{
        user:{
            id:"",
            username:"",
            password:"",
            email:"",
            sex:"",
            age:""
        },
        userList:[]
    },
    methods:{
        findAll:function () {
            var _this = this;
            axios.get('/ssm_vue/user/findAll')
                .then(function (response) {
                    _this.userList = response.data;
                })
                .catch(function (error) {
                    console.log(error);
                })
        },
        findById:function (id) {
            var _this = this;
            axios.get('/ssm_vue/user/findById',{params:{id:id}})
                .then(function (response) {
                    _this.user = response.data;
                    $("#myModal").modal("show");
                })
                .catch(function (error) {
                    console.log(error);
                })
        },
        update:function () {
            var _this = this;
            axios.post('/ssm_vue/user/update', _this.user)
                .then(function (response) {
                    _this.findAll();
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    },
    created:function () {
        this.findAll();
    }
});