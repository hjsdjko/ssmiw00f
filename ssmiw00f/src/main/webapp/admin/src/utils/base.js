const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmiw00f/",
            name: "ssmiw00f",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmiw00f/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "四六级词汇"
        } 
    }
}
export default base
