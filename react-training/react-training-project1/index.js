/* Surprise! You probably thought you could just forget
the line of code you just learned! Nope, not on my watch!

Try to write that 1-liner of React code again! This time,
see if you can figure out how to render an <ul> with 2+ <li>s inside*/
const navbar=(<nav>
    <h1>Hello</h1>
    <ul>
        <li>Menu</li>
        <li>about</li>
        <li>contact</li>
    </ul>
</nav>)
ReactDOM.render(
    navbar,
    document.getElementById("root")
)