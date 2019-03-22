# meikaijava
A revamped maven-based project for MeikaiJava book's demos and exercises.

#### 《明解Java》书里的示例代码和练习题的解答代码
##### 已重新整理，这是一个Maven项目，虽然这些基础入门的练习代码可能用不到Maven什么特性，只是为了稍微规范一点，就用Maven构建啦。
> 目录结构如下
```
meikaijava
├─.idea
│  └─dictionaries
└─src
    ├─main
    │  └─java
    │      └─io
    │          └─zwt
    │              ├─chap01
    │              ├─chap02
    │              │  └─exe
    │              ├─chap03
    │              │  └─exe
    │              ├─chap04
    │              │  └─exe
    │              ├─chap05
    │              │  └─exe
    │              └─chap06
    │                  └─exe
    └─test
        └─java
            └─io
                └─zwt
```
- 在main.java.io.zwt下，有每一章对应的包，即chap01，chap02...等。每章的练习解答代码放在其子包exe当中，例如第一章chap01.exe是第一章的练习解答代码。
- 添加了.gitignore文件，忽略不需要进行版本跟踪管理的文件（只需要对代码文件进行版本管理）
- 添加了.editorconfig文件，用于统一不同编辑环境下的编码风格偏好，例如缩进采用空格或者Tab键；如果是用空格缩进，约定缩进多少格，例如2格或是4格。

接下来继续之前未完成的阅读和代码练习，有时间或者配上视频讲解，后期有兴趣可能加入单元测试（学习目的）。
