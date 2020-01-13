/**
 * 解释器模式 自定义语言的实现
 * 
 * Sunny软件公司欲为数据库备份和同步开发一套简单的数据库同步指令，通过指令可以对 数据库中的数据和结构进行备份，
 * 例如，输入指令“COPY VIEW FROM srcDB TO desDB”表示将数据库srcDB中的所有视图(View)对象都拷贝至数据库desDB；
 * 输入指 令“MOVE TABLE Student FROM srcDB TO desDB”表示将数据库srcDB中的Student表移动 至数据库desDB。
 * 试使用解释器模式来设计并实现该数据库同步指令。
 */
/**
 * @author 卢亮
 *
 */
package behaviortype.l16interpreterpattern;