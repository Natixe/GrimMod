package fr.natixe.grimmod.client.model.armor;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.ResourceLocation;
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

		this.head.addChild(bone1);
		this.head.addChild(bone2);
		this.head.addChild(bone3);
		this.head.addChild(bone4);
		this.head.addChild(bone5);
		this.head.addChild(bone6);
		this.head.addChild(bone7);
		this.head.addChild(bone8);
		this.head.addChild(bone9);
		this.head.addChild(bone10);
		this.head.addChild(bone11);
		this.head.addChild(bone12);
		this.head.addChild(bone13);
		this.head.addChild(bone14);
		this.head.addChild(bone15);

		setupArmorParts();
	}

	public abstract void setupArmorParts();


	public final String getTexture(){
		return this.texture;
	}

	public final DamoclesHelmet applyEntityStats(BipedModel defaultArmor){

		this.leftArmPose = defaultArmor.leftArmPose;
		this.rightArmPose = defaultArmor.rightArmPose;
		this.crouching = defaultArmor.crouching;
		this.head.copyFrom(defaultArmor.head);
		this.hat.copyFrom(defaultArmor.hat);
		this.body.copyFrom(defaultArmor.body);
		this.rightArm.copyFrom(defaultArmor.rightArm);
		this.leftArm.copyFrom(defaultArmor.leftArm);
		this.rightLeg.copyFrom(defaultArmor.rightLeg);
		this.leftLeg.copyFrom(defaultArmor.leftLeg);

		return this;
	}


	@Override
	public void copyPropertiesTo(BipedModel p_217148_1_) {
		super.copyPropertiesTo(p_217148_1_);
		p_217148_1_.leftArmPose = this.leftArmPose;
		p_217148_1_.rightArmPose = this.rightArmPose;
		p_217148_1_.crouching = this.crouching;
		p_217148_1_.head.copyFrom(this.head);
		p_217148_1_.hat.copyFrom(this.hat);
		p_217148_1_.body.copyFrom(this.body);
		p_217148_1_.rightArm.copyFrom(this.rightArm);
		p_217148_1_.leftArm.copyFrom(this.leftArm);
		p_217148_1_.rightLeg.copyFrom(this.rightLeg);
		p_217148_1_.leftLeg.copyFrom(this.leftLeg);
	}

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
			// there CHEST That means our armor is chest armor , Helmet HEAD, Shin guards LEGS, Boots FEET
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


	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bone1.render(matrixStack, buffer, packedLight, packedOverlay);
		bone2.render(matrixStack, buffer, packedLight, packedOverlay);
		bone3.render(matrixStack, buffer, packedLight, packedOverlay);
		bone4.render(matrixStack, buffer, packedLight, packedOverlay);
		bone5.render(matrixStack, buffer, packedLight, packedOverlay);
		bone6.render(matrixStack, buffer, packedLight, packedOverlay);
		bone7.render(matrixStack, buffer, packedLight, packedOverlay);
		bone8.render(matrixStack, buffer, packedLight, packedOverlay);
		bone9.render(matrixStack, buffer, packedLight, packedOverlay);
		bone10.render(matrixStack, buffer, packedLight, packedOverlay);
		bone11.render(matrixStack, buffer, packedLight, packedOverlay);
		bone12.render(matrixStack, buffer, packedLight, packedOverlay);
		bone13.render(matrixStack, buffer, packedLight, packedOverlay);
		bone14.render(matrixStack, buffer, packedLight, packedOverlay);
		bone15.render(matrixStack, buffer, packedLight, packedOverlay);
	}


	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
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
		renderChildrenOnly(this.head, matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		renderChildrenOnly(this.head, matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		renderChildrenOnly(this.head, matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		renderChildrenOnly(this.head, matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		renderChildrenOnly(this.head, matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		renderChildrenOnly(this.head, matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		renderChildrenOnly(this.head, matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		renderChildrenOnly(this.head, matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		renderChildrenOnly(this.head, matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		renderChildrenOnly(this.head, matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		renderChildrenOnly(this.head, matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		renderChildrenOnly(this.head, matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		renderChildrenOnly(this.head, matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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