import 'package:flutter/cupertino.dart';

class ConstructorInjectionWidget extends StatelessWidget {
  final String customerName;

  const ConstructorInjectionWidget({super.key, required this.customerName});

  @override
  Widget build(BuildContext context) {
    return Center(child: Text(customerName));
  }
}
