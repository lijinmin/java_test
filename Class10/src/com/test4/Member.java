package com.test4;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

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
//	坦克枪长
	int gun = 16;
//	坦克子弹
	Shot shot = null;
	List<Shot> shots = null;
//	是否死亡
	boolean isLive = true;
	public int getGun() {
		return gun;
	}
	public void setGun(int gun) {
		this.gun = gun;
	}
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

//	构造函数
	public Tank(int x ,int y){
		this.x  = x;
		this.y = y;
		this.shots = new ArrayList<Shot>();
	}
//	坦克向上移动
	public void moveUp()
	{
		this.direct = 0;
		if(this.y > 20)
		{	
			this.y -= speed;
		}
		
	}
//	坦克向右移动
	public void moveRight()
	{
		this.direct = 1;
		if(this.x < 380)
		{
			this.x += speed;
		}
	}
//	坦克向下移动
	public void moveDown()
	{
		this.direct = 2;
		if(this.y < 280)
		{
			this.y += speed;
		}
	}
//	坦克向左移动
	public void moveLeft()
	{
		this.direct = 3;
		if (this.x > 20)
		{
			this.x -= speed;
		}
	}
//	坦克的枪端口坐标
	public int[] getGunLocation(){
		int[] location = new int[2];
		switch(this.direct)
		{
		case 0 :
			location[0] = this.x;
			location[1]= this.y - this.gun;
			break;
		case 1 :
			location[0] = this.x + this.gun;
			location[1] = this.y;
			break;
		case 2 :
			location[0] = this.x;
			location[1] = this.y + this.gun;
			break;
		case 3 :
			location[0] = this.x - this.gun;
			location[1] = this.y;
		}
		return location;
		
	}
//	向对方开火
	public void shotFire()
	{	
		Shot e = new Shot(this.getGunLocation(),this.direct);
		shots.add(e);
		Thread t = new Thread(e);
		t.start();
	}
}

//敌人的坦克
class EnemyTank extends Tank implements Runnable{

	public EnemyTank(int x, int y) {
		super(x, y);
		this.setColor(0);
		this.setDirect(2);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.shotFire();
		}
		
	}
	
}
//我的坦克
class Hero extends Tank implements KeyListener{

	public Hero(int x, int y) {
		super(x, y);
		this.setColor(1);
		// TODO Auto-generated constructor stub
	}
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar() == 's')
		{   
			this.moveDown();
		}else if(e.getKeyChar() == 'w')
		{
			this.moveUp();
		}else if(e.getKeyChar() == 'a')
		{
			this.moveLeft();
		}else if(e.getKeyChar() == 'd')
		{
			this.moveRight();
		}
		if(e.getKeyChar() == 'j')
		{
			this.shotFire();
		}
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}

//子弹
class Shot implements Runnable{
	int x;
	int y;
//	方向
	int direct;
//	速度
	int speed = 1;
//	是否死亡
	boolean isLive = true;
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
	public Shot(int[] args,int direct)
	{
		this.x = args[0];
		this.y = args[1];
		this.direct = direct;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			switch(this.direct)
			{
			case 0 :
				this.y -= speed;
				break ;
			case 1 :
				this.x += speed;
				break;
			case 2 :
				this.y += speed;
				break;
			case 3 :
				this.x -= speed;
				break;
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(this.x < 0 || this.x > 400 || this.y < 0 || this.y>300)
			{
				this.isLive = false;
				break;
			}
		}
		
	}
}