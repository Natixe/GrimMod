package fr.natixe.grimmod.client.model.armor;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.model.ArmorStandModel;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.client.renderer.model.ModelHelper;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ArmorStandEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.HandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public abstract class DamoclesHelmet extends BipedModel<LivingEntity> {
	protected final ModelRenderer bone1;
	protected final ModelRenderer bone2;
	protected final ModelRenderer bone3;
	protected final ModelRenderer bone4;
	protected final ModelRenderer bone5;
	protected final ModelRenderer bone6;
	protected final ModelRenderer bone7;
	protected final ModelRenderer bone8;
	protected final ModelRenderer bone9;
	protected final ModelRenderer bone10;
	protected final ModelRenderer bone11;
	protected final ModelRenderer bone12;
	protected final ModelRenderer bone13;
	protected final ModelRenderer bone14;
	protected final ModelRenderer bone15;
	protected final ObjectList<ModelRenderer> children = new ObjectArrayList<>();

	private String texture;

	@OnlyIn(Dist.CLIENT)
	public DamoclesHelmet(int textureWidth, int textureHeight, ResourceLocation texture) {
		super(1F);
		this.texWidth = textureWidth;
		this.texHeight = textureHeight;
		this.texture = texture.toString();

		bone1 = new ModelRenderer(this);
		bone1.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(bone1);

		bone2 = new ModelRenderer(this);
		bone2.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(bone2);


		bone3 = new ModelRenderer(this);
		bone3.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(bone3);

		bone4 = new ModelRenderer(this);
		bone4.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(bone4);

		bone5 = new ModelRenderer(this);
		bone5.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(bone5);

		bone6 = new ModelRenderer(this);
		bone6.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(bone6);

		bone7 = new ModelRenderer(this);
		bone7.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(bone7);

		bone8 = new ModelRenderer(this);
		bone8.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(bone8);

		bone9 = new ModelRenderer(this);
		bone9.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(bone9);

		bone10 = new ModelRenderer(this);
		bone10.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(bone10);

		bone11 = new ModelRenderer(this);
		bone11.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(bone11);

		bone12 = new ModelRenderer(this);
		bone12.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(bone12);

		bone13 = new ModelRenderer(this);
		bone13.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(bone13);

		bone14 = new ModelRenderer(this);
		bone14.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(bone14);

		bone15 = new ModelRenderer(this);
		bone15.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(bone15);

		//this.head.addChild(bone1);
		//this.head.addChild(bone2);
		//this.head.addChild(bone3);
		//this.head.addChild(bone4);
		//this.head.addChild(bone5);
		//this.head.addChild(bone6);
		//this.head.addChild(bone7);
		//this.head.addChild(bone8);
		//this.head.addChild(bone9);
		//this.head.addChild(bone10);
		//this.head.addChild(bone11);
		//this.head.addChild(bone12);
		//this.head.addChild(bone13);
		//this.head.addChild(bone14);
		//this.head.addChild(bone15);

		setupArmorParts();
	}

	public abstract void setupArmorParts();


	public final String getTexture() {
		return this.texture;
	}

	public final DamoclesHelmet applyEntityStats(BipedModel defaultArmor) {
		this.young = defaultArmor.young;
		this.crouching = defaultArmor.crouching;
		this.riding = defaultArmor.riding;
		this.rightArmPose = defaultArmor.rightArmPose;
		this.leftArmPose = defaultArmor.leftArmPose;
		this.head = defaultArmor.head;

		return this;
	}




	//@Override
	//public void copyPropertiesTo(BipedModel p_217148_1_) {
	//	super.copyPropertiesTo(p_217148_1_);
	//	p_217148_1_.crouching = this.crouching;
	//	p_217148_1_.head.copyFrom(this.head);
	//	p_217148_1_.head.copyFrom(this.head);
	//	p_217148_1_.hat.copyFrom(this.hat);
	//}

	public BipedModel applySlot(EquipmentSlotType slot){
		bone1.visible = false;
		bone2.visible = false;
		bone3.visible = false;
		bone4.visible = false;
		bone5.visible = false;
		bone6.visible = false;
		bone7.visible = false;
		bone8.visible = false;
		bone9.visible = false;
		bone10.visible = false;
		bone11.visible = false;
		bone12.visible = false;
		bone13.visible = false;
		bone14.visible = false;
		bone15.visible = false;
		switch(slot){
			case HEAD:
				bone1.visible = true;
				bone2.visible = true;
				bone3.visible = true;
				bone4.visible = true;
				bone5.visible = true;
				bone6.visible = true;
				bone7.visible = true;
				bone8.visible = true;
				bone9.visible = true;
				bone10.visible = true;
				bone11.visible = true;
				bone12.visible = true;
				bone13.visible = true;
				bone14.visible = true;
				bone15.visible = true;
				break;
			default:
				break;
		}

		return this;
	}


	//@Override
	//public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
	//	bone1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	//	bone2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	//	bone3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	//	bone4.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	//	bone5.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	//	bone6.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	//	bone7.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	//	bone8.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	//	bone9.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	//	bone10.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	//	bone11.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	//	bone12.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	//	bone13.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	//	bone14.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	//	bone15.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	//}

	//public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
	//	copyModelAngles(this.head, this.bone1);
	//	copyModelAngles(this.head, this.bone2);
	//	copyModelAngles(this.head, this.bone3);
	//	copyModelAngles(this.head, this.bone4);
	//	copyModelAngles(this.head, this.bone5);
	//	copyModelAngles(this.head, this.bone6);
	//	copyModelAngles(this.head, this.bone7);
	//	copyModelAngles(this.head, this.bone8);
	//	copyModelAngles(this.head, this.bone9);
	//	copyModelAngles(this.head, this.bone10);
	//	copyModelAngles(this.head, this.bone11);
	//	copyModelAngles(this.head, this.bone12);
	//	copyModelAngles(this.head, this.bone13);
	//	copyModelAngles(this.head, this.bone14);
	//	copyModelAngles(this.head, this.bone15);
	//	matrixStack.pushPose();
	//	if(crouching) matrixStack.translate(0, 0.2, 0);
//
	//	renderChildrenOnly(this.head, matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//
	//	matrixStack.popPose();
	//}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		copyModelAngles(this.head, this.bone1);
		copyModelAngles(this.head, this.bone2);
		copyModelAngles(this.head, this.bone3);
		copyModelAngles(this.head, this.bone4);
		copyModelAngles(this.head, this.bone5);
		copyModelAngles(this.head, this.bone6);
		copyModelAngles(this.head, this.bone7);
		copyModelAngles(this.head, this.bone8);
		copyModelAngles(this.head, this.bone9);
		copyModelAngles(this.head, this.bone10);
		copyModelAngles(this.head, this.bone11);
		copyModelAngles(this.head, this.bone12);
		copyModelAngles(this.head, this.bone13);
		copyModelAngles(this.head, this.bone14);
		copyModelAngles(this.head, this.bone15);

		matrixStack.pushPose();
		if(crouching) matrixStack.translate(0, 0.2, 0);

		renderChildrenOnly(this.head, matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);

		matrixStack.popPose();
	}

	private final void renderChildrenOnly(ModelRenderer bodyPart, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		if(!this.children.isEmpty()){
			matrixStack.pushPose();
			bodyPart.translateAndRotate(matrixStack);
			for(ModelRenderer child : this.children)
				child.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			matrixStack.popPose();
		}
	}



	//protected Iterable<ModelRenderer> headParts() {
	//	return ImmutableList.of(this.head);
	//}
////
	//public ModelRenderer getHead() {
	//	return this.head;
	//}
////
	//public void setAllVisible(boolean p_178719_1_) {
	//	this.head.visible = p_178719_1_;
	//	this.hat.visible = p_178719_1_;
	//}


	//@Override
	//public void setupAnim(LivingEntity entityIn, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {
	//	boolean flag = entityIn.getFallFlyingTicks() > 4;
	//	boolean flag1 = entityIn.isVisuallySwimming();
	//	this.head.yRot = p_225597_5_ * ((float)Math.PI / 180F);
	//	if (flag) {
	//		this.head.xRot = (-(float)Math.PI / 4F);
	//	} else if (this.swimAmount > 0.0F) {
	//		if (flag1) {
	//			this.head.xRot = this.rotlerpRad(this.swimAmount, this.head.xRot, (-(float)Math.PI / 4F));
	//		} else {
	//			this.head.xRot = this.rotlerpRad(this.swimAmount, this.head.xRot, p_225597_6_ * ((float)Math.PI / 180F));
	//		}
	//	} else {
	//		this.head.xRot = p_225597_6_ * ((float)Math.PI / 180F);
	//	}
////
	//	this.setupAttackAnimation(entityIn, p_225597_4_);
	//	if (this.crouching) {
	//		this.head.y = 4.2F;
	//	} else {
	//		this.head.y = 0.0F;
	//	}
////
	//	this.hat.copyFrom(this.head);
	//}



	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	private final void copyModelAngles(ModelRenderer in, ModelRenderer out){
		out.xRot = in.xRot;
		out.yRot = in.yRot;
		out.zRot = in.zRot;
	}

}