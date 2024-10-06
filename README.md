# 2.Polymorphism-shape-game

### Assignment: 1
In `Window.java` we have a couple of shapes that all share the same method: `.draw()`

```java
final MySquare sq = new MySquare();
final MyCircle ci = new MyCircle();
final MyRectangle re = new MyRectangle();
final MyOval ov = new MyOval();

sq.draw();
ci.draw();
re.draw();
ov.draw();
```

The assignment: make an interface that contains the method `void draw()`
Implement that interface in `MySquare`, `MyCircle`, `MyRectangle` and `MyOval`.


### Assignment 2
in the class `Panel.java` you find the follwoing:
```java
@Override
protected void paintComponent(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;

    DRAW_INSTRUCTIONS.forEach(drawInstructions -> {
        g2d.setColor(drawInstructions.getColor());
        g2d.fill(drawInstructions.getShape());
    });
}
```

We can make this `.foreach()` much better by using the interface we just made.
By changing the `void draw()` method to `void draw(Graphics2D g2d)` it is possible to move those two lines:
```java
g2d.setColor(drawInstructions.getColor());
g2d.fill(drawInstructions.getShape());
```
to the new `draw` method, and remove the `DrawInstructions` class.
