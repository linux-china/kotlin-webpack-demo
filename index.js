const ktLib = require("./kotlin_build/ktLib")
import {html, render} from 'lit-html';

let h1 = (name) => html`<h1>${name}</h1>`;

render(h1(ktLib.hello("Everybody")), document.getElementById("litHtml1"));
