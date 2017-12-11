package com.test3;

//坦克类
class Tank{
//	坦克的方向 0 向上，1向右，2向下，3向左
	int direct= 0;
	//	坦克的横坐标
	int x=0;
	//	坦克的纵坐标
	int y=0;
//	坦克的速度
	int speed = 1;
//	颜色
	int color;
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDirect() {
		return direct;
	}
	public void setDirect(int direct) {
		this.direct = direct;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	
	public Tank(int x ,int y){
		this.x  = x;
		this.y = y;
	}
//	坦克向上移动
	public void moveUp()
	{
		this.direct = 0;
		this.y -= speed;
	}
//	坦克向右移动
	public void moveRight()
	{
		this.direct = 1;
		this.x += speed;
	}
//	坦克向下移动
	public void moveDown()
	{
		this.direct = 2;
		this.y += speed;
	}
//	坦克向左移动
	public void moveLeft()
	{
		this.direct = 3;
		this.x -= speed;
	}
}

//敌人的坦克
class EnemyTank extends Tank{

	public EnemyTank(int x, int y) {
		super(x, y);
		this.setColor(0);
		this.setDirect(2);
	}
	
}
//我的坦克
class Hero extends Tank{

	public Hero(int x, int y) {
		super(x, y);
		this.setColor(1);
		// TODO Auto-generated constructor stub
	}
	
}