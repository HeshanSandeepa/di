import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      title: 'Dependency Injection Demo',
      home: MyQuotePage(title: 'Dependency Injection Demo Page'),
    );
  }
}

class MyQuotePage extends StatefulWidget {
  final String title;

  const MyQuotePage({required this.title});

  @override
  _MyQuotePageState createState() => _MyQuotePageState();
}

class _MyQuotePageState extends State<MyQuotePage> {
  final List _data = [
    {
      "quote": "Simplicity is a great virtue.",
      "author": "Edsger Wybe Dijkstra"
    },
    {"quote": "Progress and dont look back.", "author": "Michael Nielsen"}
  ];
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text(widget.title),
        ),
        body: Center(
          child: ListView.builder(
            itemCount: _data.length,
            itemBuilder: (context, index) =>
                _QuoteItem(item: _data[index], index: index),
          ),
        ));
  }
}

class _QuoteItem extends StatelessWidget {
  final dynamic item;
  final int index;

  _QuoteItem({required this.item, required this.index});

  @override
  Widget build(BuildContext context) {
    return ListTile(
      tileColor: index % 2 == 0 ? Colors.white : Colors.grey.withOpacity(0.1),
      title: Text(
        '"${item["quote"]}"',
      ),
      subtitle: Padding(
        padding: const EdgeInsets.only(top: 10),
        child: Text('- ${item["author"]}',
            style: const TextStyle(fontWeight: FontWeight.bold, fontSize: 10)),
      ),
    );
  }
}
