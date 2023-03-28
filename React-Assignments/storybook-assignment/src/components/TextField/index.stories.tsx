import React from 'react'
import TextFieldComponent from '.'
import { ComponentMeta, ComponentStory } from '@storybook/react'

export default {
    title: 'atoms/TextField',
    component: TextFieldComponent,
    argTypes: {
        variant: {
            control: 'select', 
            options: ['outlined', 'filled', 'standard'],
        }
    }
} as ComponentMeta<typeof TextFieldComponent>;

const Template: ComponentStory<typeof TextFieldComponent> = (args) => (
    <TextFieldComponent  {...args} />
);

export const textField = Template.bind({});
textField.args = {
    label: 'Enter Text here',
    variant: 'outlined',
}

