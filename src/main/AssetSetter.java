package main;

import data.Progress;
import entity.NPC_BigRock;
import entity.NPC_Merchant;
import entity.NPC_OldMan;
import monster.MON_Bat;
import monster.MON_GreenSlime;
import monster.MON_Orc;
import monster.MON_RedSlime;
import monster.MON_SkeletonLord;
import object.Obj_Axe;
import object.Obj_BlueHeart;
import object.Obj_Boots;
import object.Obj_Chest;
import object.Obj_Door;
import object.Obj_Door_Iron;
import object.Obj_Key;
import object.Obj_Lantern;
import object.Obj_Pickaxe;
import object.Obj_Potion_Red;
import object.Obj_Shield_Blue;
import object.Obj_Tent;
import tile_interactive.IT_DestructibleWall;
import tile_interactive.IT_DryTree;
import tile_interactive.IT_MetalPlate;

public class AssetSetter {

	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		
		int i = 0;
		
		int mapNum = 0;
		
		
		gp.obj[mapNum][i] = new Obj_Axe(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*38;
		gp.obj[mapNum][i].worldY = gp.tileSize*8;
		i++;
		
		gp.obj[mapNum][i] = new Obj_Shield_Blue(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*12;
		gp.obj[mapNum][i].worldY = gp.tileSize*11;
		i++;
		
		gp.obj[mapNum][i] = new Obj_Door(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*14;
		gp.obj[mapNum][i].worldY = gp.tileSize*28;
		i++;
		
		gp.obj[mapNum][i] = new Obj_Door(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*12;
		gp.obj[mapNum][i].worldY = gp.tileSize*12;
		i++;
		
		gp.obj[mapNum][i] = new Obj_Chest(gp);
		gp.obj[mapNum][i].setLoot(new Obj_Key(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize*30;
		gp.obj[mapNum][i].worldY = gp.tileSize*29;
		i++;

		gp.obj[mapNum][i] = new Obj_Chest(gp);
		gp.obj[mapNum][i].setLoot(new Obj_Potion_Red(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize*39;
		gp.obj[mapNum][i].worldY = gp.tileSize*42;
		i++;

		gp.obj[mapNum][i] = new Obj_Chest(gp);
		gp.obj[mapNum][i].setLoot(new Obj_Boots(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize*32;
		gp.obj[mapNum][i].worldY = gp.tileSize*42;
		i++;
		
		gp.obj[mapNum][i] = new Obj_Tent(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*20;
		gp.obj[mapNum][i].worldY = gp.tileSize*8;
		i++;
		
		
		
		// Dungeon Base1:
		mapNum = 2;
		i = 0;
		gp.obj[mapNum][i] = new Obj_Chest(gp); // 1st chest Imp., placed on the bottom right side
		gp.obj[mapNum][i].setLoot(new Obj_Pickaxe(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize*40;
		gp.obj[mapNum][i].worldY = gp.tileSize*41;
		i++;
		gp.obj[mapNum][i] = new Obj_Chest(gp);
		gp.obj[mapNum][i].setLoot(new Obj_Potion_Red(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize*13;
		gp.obj[mapNum][i].worldY = gp.tileSize*16;
		i++;
		gp.obj[mapNum][i] = new Obj_Chest(gp);
		gp.obj[mapNum][i].setLoot(new Obj_Potion_Red(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize*26;
		gp.obj[mapNum][i].worldY = gp.tileSize*34;
		i++;
		gp.obj[mapNum][i] = new Obj_Chest(gp);
		gp.obj[mapNum][i].setLoot(new Obj_Lantern(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize*27;
		gp.obj[mapNum][i].worldY = gp.tileSize*15;
		i++;
		// // Iron Door
		gp.obj[mapNum][i] = new Obj_Door_Iron(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*18;
		gp.obj[mapNum][i].worldY = gp.tileSize*23;
		i++;



		// Dungeon Base2:
		mapNum = 3;
		i = 0;

		// Iron Door
		gp.obj[mapNum][i] = new Obj_Door_Iron(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*25;
		gp.obj[mapNum][i].worldY = gp.tileSize*15;
		i++;

		// Iron Door
		gp.obj[mapNum][i] = new Obj_BlueHeart(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*25;
		gp.obj[mapNum][i].worldY = gp.tileSize*8;
		i++;
		
	}
	
	public void setNPC() {
		
		int mapNum = 0;
		int i=0;
		gp.npc[mapNum][i] = new NPC_OldMan(gp);
		gp.npc[mapNum][i].worldX = gp.tileSize*21;
		gp.npc[mapNum][i].worldY = gp.tileSize*21;
		i++;
		
		mapNum = 1;
		i=0;
		gp.npc[mapNum][i] = new NPC_Merchant(gp);
		gp.npc[mapNum][i].worldX = gp.tileSize*12;
		gp.npc[mapNum][i].worldY = gp.tileSize*7;
		i++;
		
		mapNum = 2;
		i=0;
		gp.npc[mapNum][i] = new NPC_BigRock(gp);
		gp.npc[mapNum][i].worldX = gp.tileSize*20;
		gp.npc[mapNum][i].worldY = gp.tileSize*25;
		i++;
		gp.npc[mapNum][i] = new NPC_BigRock(gp);
		gp.npc[mapNum][i].worldX = gp.tileSize*11;
		gp.npc[mapNum][i].worldY = gp.tileSize*18;
		i++;
		gp.npc[mapNum][i] = new NPC_BigRock(gp);
		gp.npc[mapNum][i].worldX = gp.tileSize*23;
		gp.npc[mapNum][i].worldY = gp.tileSize*14;
		i++;
	
	}

	public void setMonster() {
		
		int i = 0;
		int mapNum = 0;
		
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*21;
		gp.monster[mapNum][i].worldY = gp.tileSize*38;
		i++;
		
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*23;
		gp.monster[mapNum][i].worldY = gp.tileSize*42;
		i++;
		
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*24;
		gp.monster[mapNum][i].worldY = gp.tileSize*37;
		i++;
		
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*34;
		gp.monster[mapNum][i].worldY = gp.tileSize*42;
		i++;
		
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*38;
		gp.monster[mapNum][i].worldY = gp.tileSize*42;
		i++;
		
		gp.monster[mapNum][i] = new MON_Orc(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*12;
		gp.monster[mapNum][i].worldY = gp.tileSize*33;
		i++;
		
		gp.monster[mapNum][i] = new MON_RedSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*35;
		gp.monster[mapNum][i].worldY = gp.tileSize*9;
		i++;
		
		gp.monster[mapNum][i] = new MON_RedSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*38;
		gp.monster[mapNum][i].worldY = gp.tileSize*7;
		i++;
		
		gp.monster[mapNum][i] = new MON_RedSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*40;
		gp.monster[mapNum][i].worldY = gp.tileSize*9;
		i++;
		
		
		mapNum = 2;
		i = 0;
		
		gp.monster[mapNum][i] = new MON_Bat(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*34;
		gp.monster[mapNum][i].worldY = gp.tileSize*39;
		i++;
		
		gp.monster[mapNum][i] = new MON_Bat(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*36;
		gp.monster[mapNum][i].worldY = gp.tileSize*25;
		i++;
		
		gp.monster[mapNum][i] = new MON_Bat(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*39;
		gp.monster[mapNum][i].worldY = gp.tileSize*26;
		i++;
		
		gp.monster[mapNum][i] = new MON_Bat(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*28;
		gp.monster[mapNum][i].worldY = gp.tileSize*11;
		i++;
		
		gp.monster[mapNum][i] = new MON_Bat(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*10;
		gp.monster[mapNum][i].worldY = gp.tileSize*19;
		i++;
		
		
		mapNum = 3;
		i = 0;
		
		if(Progress.skeletonLordDefeated == false){
			gp.monster[mapNum][i] = new MON_SkeletonLord(gp);
			gp.monster[mapNum][i].worldX = gp.tileSize*23;
			gp.monster[mapNum][i].worldY = gp.tileSize*16;
			i++;
		}
	}
	
	public void setInteractiveTile() {
		int i = 0;
		int mapNum = 0;
		
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 12); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 28, 12); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 29, 12); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 30, 12); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 31, 12); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 32, 12); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 33, 12); i++;
		
		
		// for merchent's House:
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 18, 40); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 17, 40); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 16, 40); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 15, 40); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 14, 40); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 13, 40); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 13, 41); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 12, 41); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 11, 41); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 41); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 40); i++;
		
		
		// for chest:
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 25, 27); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 26, 27); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 27); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 28); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 29); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 30); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 31); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 28, 31); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 29, 31); i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 29, 31); i++;
		
		
		// Dungeon Base1
		mapNum = 2;
		i = 0;
		
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 18, 30); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 17, 31); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 17, 32); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 17, 34); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 18, 34); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 18, 33); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 10, 22); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 10, 24); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 38, 18); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 38, 19); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 38, 20); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 38, 21); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 18, 13); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 18, 14); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 22, 28); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 30, 28); i++;
		gp.iTile[mapNum][i] = new IT_DestructibleWall(gp, 32, 28); i++;
		
		gp.iTile[mapNum][i] = new IT_MetalPlate(gp, 20, 22); i++;
		gp.iTile[mapNum][i] = new IT_MetalPlate(gp, 8, 17); i++;
		gp.iTile[mapNum][i] = new IT_MetalPlate(gp, 39, 31); i++;
		
	}
}


