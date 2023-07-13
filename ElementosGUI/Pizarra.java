package com.curso_simulaciones.dibujos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class Pizarra extends View {
    public Pizarra(Context context){
        super(context);
    }
    //Método para dibujar:
    protected void onDraw(Canvas canvas){
        Paint pincel = new Paint();
        pincel.setAntiAlias(true);
        pincel.setColor(Color.BLACK);
        pincel.setTextSize(40f);
        pincel.setStrokeWidth(5);
        //Texto:
        canvas.drawText("Hola",20f,50f,pincel);
        //Línea:
        pincel.setColor(Color.rgb(145,234,177));
        canvas.drawLine(75,100,75,250,pincel);
        //Círculo con radio y centro:
        pincel.setColor(Color.BLUE);
        canvas.drawCircle(75,370,50,pincel);
        //Circunferencia con radio y centro:
        pincel.setColor(Color.rgb(200,200,45));
        pincel.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(75,500,50,pincel);
        //Rectangulo transparente:
        pincel.setStyle(Paint.Style.FILL);
        pincel.setColor(Color.argb(200,200,45,100));
        canvas.drawRect(50,425,100,575,pincel);
        //Arco:
        RectF rectF = new RectF(25,600,225,800);
        pincel.setColor(Color.BLACK);
        canvas.drawArc(rectF,180,355,true,pincel);
        //Trazo:
        pincel.setStyle(Paint.Style.STROKE);
        Point a = new Point(1000,340);
        Point b = new Point(850,450);
        Point c = new Point(1150,450);
        Point d = new Point(900,600);
        Point e = new Point(1100,600);

        Path path = new Path();
        path.moveTo(a.x,a.y);
        path.lineTo(d.x,d.y);
        path.moveTo(d.x,d.y);
        path.lineTo(c.x,c.y);
        path.moveTo(c.x,c.y);
        path.lineTo(b.x,b.y);
        path.moveTo(b.x,b.y);
        path.lineTo(e.x,e.y);
        path.moveTo(e.x,e.y);
        path.lineTo(a.x,a.y);
        path.close();
        canvas.drawPath(path,pincel);

        //Logo:
        Path trazo = new Path();
        trazo.addCircle(1500,500,200, Path.Direction.CCW);
        pincel.setStyle(Paint.Style.FILL);
        pincel.setColor(Color.argb(400,10,100,0));
        canvas.drawPath(trazo,pincel);
        pincel.setColor(Color.BLACK);
        pincel.setStyle(Paint.Style.STROKE);
        canvas.drawTextOnPath("Universidad Nacional de Colombia",trazo,625,50,pincel);
        //Texto:
        pincel.setTextSize(200f);
        pincel.setStrokeWidth(5);
        canvas.drawText("UN",1360f,575f,pincel);
        
    };
}
