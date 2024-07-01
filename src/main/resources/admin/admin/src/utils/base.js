const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot5j0wf/",
            name: "springboot5j0wf",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot5j0wf/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "抗疫物资管理系统"
        } 
    }
}
export default base
