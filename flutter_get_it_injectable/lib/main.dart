import 'package:flutter/material.dart';
import 'package:flutter_get_it_injectable/injection.dart';
import 'package:flutter_get_it_injectable/quote_repository.dart';
import 'package:get_it/get_it.dart';

void main() {
  WidgetsFlutterBinding.ensureInitialized();
  configureDependencies();
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

  const MyQuotePage({super.key, required this.title});

  @override
  _MyQuotePageState createState() => _MyQuotePageState();
}

class _MyQuotePageState extends State<MyQuotePage> {
  late QuoteRepository _quoteRepository;
  late Future<List> _futureQuote;
  @override
  void initState() {
    super.initState();
    _quoteRepository = GetIt.instance.get<QuoteRepository>(param1: "testing");
    _futureQuote = _quoteRepository.getQuotes();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text(widget.title),
        ),
        body: Center(
            child: FutureBuilder<List>(
                future: _futureQuote,
                builder: (context, AsyncSnapshot<List> snapData) {
                  if (snapData.connectionState == ConnectionState.waiting) {
                    return const Center(
                        child: Text('Please wait its loading...'));
                  } else {
                    if (snapData.hasError) {
                      return Center(child: Text('Error: ${snapData.error}'));
                    } else {
                      return ListView.builder(
                        itemCount: snapData.data?.length,
                        itemBuilder: (context, index) => _QuoteItem(
                            item: snapData.data?[index], index: index),
                      );
                    }
                  }
                })));
  }
}

class _QuoteItem extends StatelessWidget {
  final dynamic item;
  final int index;

  const _QuoteItem({required this.item, required this.index});

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
