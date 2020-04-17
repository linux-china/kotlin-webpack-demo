'use strict';
const KotlinWebpackPlugin = require('@jetbrains/kotlin-webpack-plugin');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const path = require('path');

module.exports = {
    entry: './index.js', // kotlinApp is the default module name
    //node or browser
    target: "node",
    output: {
        filename: '[name]-bundle.js',
        path: path.resolve(__dirname, 'dist')
    },
    mode: "development",
    resolve: {
        modules: ['kotlin_build', 'node_modules'],
    },
    module: {
        rules: [
            {
                test: /\.js$/,
                include: path.resolve(__dirname, '../kotlin_build'),
                exclude: [
                    /kotlin\.js$/, // Kotlin runtime doesn't have sourcemaps at the moment
                ],
                use: ['source-map-loader'],
                enforce: 'pre',
            },
        ],
    },
    plugins: [
        new KotlinWebpackPlugin({
            src: __dirname + '/src',
            moduleName: "ktLib",
            librariesAutoLookup: true
        }),
        new HtmlWebpackPlugin({
            template: path.join(__dirname, 'index.html'),
        }),
    ],
};